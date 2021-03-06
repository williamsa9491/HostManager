/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Communications;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implements the incoming and outgoing connection for our program over a Socket
 *
 * @author awilliams5
 */
public class SocketConnection implements Connection{
    //Listeners listening to this connection
    private ArrayList<FilterListener> filters = new ArrayList<FilterListener>();
    //Ip adress of local host
    private String ipAddress = "127.0.0.1";
    private Socket socket;
    private BufferedReader in;
    OutputStreamWriter out;
    
    public SocketConnection() {
        initSocket();
        SocketDataListener listen = new SocketDataListener();
        Thread t = new Thread(listen);
        t.start();
    }
    
    /**
     * Connects the object up to the specified Socket
     */
    private void initSocket() {
        try {
            socket = new Socket(ipAddress, 32123);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new OutputStreamWriter(socket.getOutputStream());
        } catch (IOException ex) {
                System.out.println(ex.getMessage());
        }
        
    }

    @Override
    public void attachFilter(FilterListener newFilter) {
        filters.add(newFilter);
    }
    
    @Override
    public void notify(byte[] msg) {
        for(FilterListener filter : filters) {
            filter.msgAvailable(msg);
        }
    }
    
    /**
     * Calls an update on all of the FilterListeners that are listening to 
     * this connection
     * 
     * @param s 
     */
    private void updateListeners(String s) {
            notify(s.getBytes());
    }

    @Override
    public void start() {
        //Not used for this class
    }

    @Override
    public void stop() {

    }
    
    /**
     * Implements the constant listening to the socket and passes on messages 
     * when available
     */
    private class SocketDataListener implements Runnable {

        @Override
        public void run() {
           while(true) {
               try {
                   String message = in.readLine();
                   if(message == null)
                       message = "dummy";
                   updateListeners(message);
               } catch (IOException ex) {
                   Logger.getLogger(SocketConnection.class.getName()).log(Level.SEVERE, null, ex);
               }
               try {
                   TimeUnit.MILLISECONDS.sleep(16L);
               } catch (InterruptedException ex) {
                   Logger.getLogger(SocketConnection.class.getName()).log(Level.SEVERE, null, ex);
               }
               
           } 
        }    
    }
}
