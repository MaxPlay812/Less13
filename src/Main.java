import Hotel.Client;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean sorted=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world!");
        Client buff;
        Client[] clients = new Client[3];
        for (int i = 0; i< clients.length; i++) {
            clients[i] = new Client();
            System.out.println("������� ���");
            clients[i].setName(scanner.nextLine());
            System.out.println("������� �������");
            clients[i].setSurname(scanner.nextLine());
            System.out.println("������� �����");
            clients[i].setAdres(scanner.nextLine());
            System.out.println("������� ����� ����������� �����");
            clients[i].setBankNumber(scanner.nextLine());
        }
        while (!sorted){
            sorted = true;
            for(int i = 0; i < clients.length - 1; i++){
                if(clients[i].getSurname().charAt(0) > clients[i+1].getSurname().charAt(0)){
                    buff = clients[i];
                    clients[i] = clients[i+1];
                    clients[i+1] = buff;
                    sorted = false;
                }
            }
        }
        for (Client client : clients) {
            System.out.println("��� : " + client.getName() + " ������� : " + client.getSurname() + " ����� : " + client.getAdres() + " ����� ����������� ����� : " + client.getBankNumber());
        }
    }
}