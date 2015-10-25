/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorsocket.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author charles
 */
public class Atuador {
    
    public static void main(String args[]){
        Atuador atuador = new Atuador();
        atuador.startServer(9002, "TCP");
    }
    
    public void startServer(int port, String type) { 
        if (type.equals("TCP")) {

            try {
                while (true) {
                    ServerSocket serverSocket = null;

                    serverSocket = new ServerSocket(port);
                    Socket clientSocket = null;

                    clientSocket = serverSocket.accept();

                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),
                            true);
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(clientSocket.getInputStream()));

                    String sentence = in.readLine();
                    out.println(sentence);
                    System.out.println(sentence);

                    out.close();
                    in.close();
                    clientSocket.close();
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
                while (true) {
                    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                    serverSocket.receive(receivePacket);
                    String sentence = new String(receivePacket.getData());

                    System.out.println(sentence);
                    InetAddress IPAddress = receivePacket.getAddress();
                    int portCli = receivePacket.getPort();
                    sendData = sentence.getBytes();
                    DatagramPacket sendPacket =
                            new DatagramPacket(sendData, sendData.length, IPAddress, portCli);
                    serverSocket.send(sendPacket);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
