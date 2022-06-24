package rentcar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CarOwner extends Person {
	
	private int balance;
	public CarOwner() {
		super();
	}
	



public CarOwner(int balance,int id,String aadhar,String name,String contact_no) {
	super(id,aadhar,name,contact_no);
	this.balance=balance;
}
public int getBalance() {
    return balance;
}
public void setBalance(int balance) {
    this.balance = balance;
}




@Override
public void add() {
	ArrayList<CarOwner> carOwner=RentRunner.carOwnerList;
	///for unique id
	if(carOwner.isEmpty()) {
		this.id=1;
	}
	else {
		this.id=carOwner.get(carOwner.size()-1).id+1;
	}
	carOwner.add(this);
	File file = new File("CarOwner.txt");
    if (!file.exists()) {
        try {
            file.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    ObjectOutputStream outputStream = null;
    try {
        outputStream = new ObjectOutputStream(new FileOutputStream(file));
        for (int i = 0; i < carOwner.size(); i++) {
            outputStream.writeObject(carOwner.get(i));
        }
    } catch (FileNotFoundException e) {
        System.out.println(e);
    } catch (IOException e) {
        System.out.println(e);
    } finally {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
	// TODO Auto-generated method stub
	
}








@Override
public void update() {
	// TODO Auto-generated method stub
	
}




@Override
public void remove() {
	// TODO Auto-generated method stub
	
}




@Override
public void print() {
	// TODO Auto-generated method stub
	
}
}
