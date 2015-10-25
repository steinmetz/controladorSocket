/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorsocket.socket;

import org.w3c.dom.Text;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Random;

/**
 * Created by charles on 23/10/15.
 */
public class Sensor {

    private float value = 0;
    private boolean runningServer = true;
    
    public static void main(String args[]){
        Sensor s = new Sensor();
        s.startServer(9000, "TCP");
    }

    public Sensor() {
        new Thread(new Runnable() {

            @Override
            public void run() {
                int max = 90;
                int min = -90;
                Random rand = new Random();
                while (runningServer) {
                    value = rand.nextInt((max - min) + 1) + min;
                }

            }
        }).start();
    }

    public float getValue() {
        return value;
    }

    public void startServer(int port, String type) {
        runningServer = true;
        if (type.equals("TCP")) {
            ServerSocket serverSocket = null;

            try {
                while (runningServer) {
                    serverSocket = new ServerSocket(port);

                    Socket socket = null;
                    socket = serverSocket.accept();

                    PrintWriter out = new PrintWriter(socket.getOutputStream(),
                            true);
                    out.println(getValue());
                    out.close();
                    socket.close();
                    serverSocket.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            // UDP
        } else {
            try {

                byte[] receiveData = new byte[10];
                byte[] sendData = new byte[10];
                DatagramSocket serverSocket = new DatagramSocket(port);
                while (runningServer) {
                    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                    serverSocket.receive(receivePacket);
                    String sentence = new String(receivePacket.getData());
                    InetAddress IPAddress = receivePacket.getAddress();
                    int portCli = receivePacket.getPort();
                    sendData = String.valueOf(getValue()).getBytes();
                    DatagramPacket sendPacket
                            = new DatagramPacket(sendData, sendData.length, IPAddress, portCli);
                    serverSocket.send(sendPacket);
                }
                serverSocket.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void stopServer() {
        runningServer = false;
    }

}
