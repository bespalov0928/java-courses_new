package ru.lesson.clinic;
import java.util.*;

public class Clinic {
    /*список клиентов*/
//	private final Client[] clients;
    private String clientName;
    private LinkedList<Client> clients = new LinkedList<Client>();
    private Client clientFind;
    private Pet petFind;
    private String petName;
    private LinkedList<User> users = new LinkedList<User>();



/*	public Clinic(final int size){
		this.clients = new Client[size];
	}*/

    /*добавить клиента*/
    public void addClient_old(final int position, final Client client) throws UserException {
        this.clients.add(client);
    }

    public void addClient(final Client client) throws UserException {
        this.clients.add(client);

    }


    public Client findClientsByClientName(final String name) {

        clientFind = null;
        String clientName = "не найден клиент.";
        for (Client client : this.clients) {
            if (client.getNameClient().equals(name)) {
                clientName = client.getNameClient();
                clientFind = client;
                break;
            }
        }
        System.out.println(clientName);
        return clientFind;

/*		System.out.println(clients.length);
		for(int i = 0; i<clients.length; i++){
			if(clients[i]==null){
				break;
			}
			clientName = clients[i].getNameClient();
//			System.out.println(i);
//			System.out.println(clientName);
			//System.out.println(name);
			if(clientName.equals(name)){
				System.out.println("find client: "+clients[i]+" "+clientName);
				//return clients[i];
				clientFind = clients[i];
				//break;
			}
		}*/

        /*реализовать*/
        //return new Client[]{};
    }

    public Client findClientsByPetName(final String name) {

        clientFind = null;
        String clientName = "не найдено животное.";
        for (Client client : this.clients) {
            if (client.getPet().getName().equals(name)) {
                clientName = client.getPet().getName();
                clientFind = client;
                break;
            }
        }
        System.out.println(clientName);
        return clientFind;

/*		System.out.println(clients.length);
		for(int i = 0; i<clients.length; i++){
			if(clients[i]==null){
				break;
			}
			petFind = clients[i].getPet();
			petName = petFind.getName();
			if(petName.equals(name)){
				System.out.println("find client: "+clients[i]+" "+petName);
				//return clients[i];
				clientFind = clients[i];
				//break;
			}
		}
		return clientFind;*/
        /*реализовать*/
        //return new Client[]{};
    }


    public void editC_old(Integer position, String name) {

        //clients[position].setNameClient(name);
    }

    public void editC(String nameFind, String name) {
        for (Client client : this.clients) {
            if (client.getNameClient().equals(nameFind)) {
                client.setNameClient(name);
                break;
            }
        }
//		clients[position].setNameClient(name);
    }

    public void editP_old(Integer position, String name) {
/*		petFind = clients[position].getPet();
		petFind.setName(name);*/
    }

    public void editP(String nameFind, String name) {
        for (Client client : this.clients) {
            if (client.getPet().getName().equals(nameFind)) {
                client.getPet().setName(name);
                break;
            }
        }
    }


    public void delC_old(Integer pos) {
/*        List<Client> listOfClient = new ArrayList<Client>();
        Collections.addAll(listOfClient, clients);
        listOfClient.remove(pos.intValue());
        listOfClient.toArray(clients);//new Client[listOfClient.size()]);*/
    }

    public void delC(String name) throws UserException {
        for (Client client : this.clients) {
            if (client.getNameClient().equals(name)) {
                this.clients.remove(client);
                break;
            }
        }
/*		for (int i = 0; i<clients.length; i++){
			if (clients[i]!=null) {
				if (clients[i].getNameClient().equals(name)) {
					clients[i] = null;
					break;
				}
			}else{
				throw new UserException("null");
			}
		}*/
    }

    public void delP(String name) throws UserException {
        for (Client client : this.clients) {
            if (client.getPet().getName().equals(name)) {
                client.delPet();
                break;
            }
        }
    }


    public LinkedList<Client> show() throws UserException {
        for (Client client : this.clients) {
            if (client.getPet() != null) {
                System.out.println("Client:" + client.getNameClient() + " Pet:" + client.getPet().getName());
            }else{
                throw new UserException(client.getNameClient()+" домашнего животного нет");
            }
        }
        return this.clients;
       /*for(int i = 0; i<clients.length; i++){
			if(clients[i]==null){
				continue;
			}
			clientName = clients[i].getNameClient();
			System.out.println(clients[i].getNameClient());
			petFind = clients[i].getPet();
			petName = petFind.getName();
			System.out.println("Client:"+clientName+" Pet:"+petName);
		}*/
/*
		System.out.println(Arrays.toString(clients));
		return this.clients;
*/
    }

    public void addUs(final User user) throws UserException{
        this.users.add(user);
    }

    public LinkedList<User> showUs() throws UserException {
        for (User user : this.users) {
            System.out.println("Id:" + user.getId() + " Name:" + user.getName());
        }
        return this.users;
       /*for(int i = 0; i<clients.length; i++){
			if(clients[i]==null){
				continue;
			}
			clientName = clients[i].getNameClient();
			System.out.println(clients[i].getNameClient());
			petFind = clients[i].getPet();
			petName = petFind.getName();
			System.out.println("Client:"+clientName+" Pet:"+petName);
		}*/
/*
		System.out.println(Arrays.toString(clients));
		return this.clients;
*/
    }


    public int clinicLength() {
//		return clients.length;
        return this.clients.size();
    }
}
