package fi.haagahelia.customer.utils;

import java.util.Date;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fi.haagahelia.customer.domain.Customer;
import fi.haagahelia.customer.domain.CustomerRepository;
import fi.haagahelia.customer.domain.Training;
import fi.haagahelia.customer.domain.TrainingRepository;

@Component
public class PopulateDB {
	@Autowired
	private CustomerRepository repository; 
	
	@Autowired
	private TrainingRepository trepository; 
	
	public void populate() {
		repository.deleteAll();
		trepository.deleteAll();
	
		Customer c = new Customer("John", "Johnson", "5th Street", "23110", "Flintsone", "john@mail.com", "232-2345540");
		repository.save(c);
		Customer c2 = new Customer("Mary", "Philips", "Hill Street 3", "23322", "Flintsone", "m.philips@mail.com", "232-310122");
		repository.save(c2);
		Customer c3 = new Customer("Dan", "Davidson", "32 Main Road", "23130", "Flintsone", "dan.d@mail.com", "232-1227006");
		repository.save(c3);
		Customer c4 = new Customer("Erick", "Wilfrid", "71 Pilgrim Avenue", "23130", "Flintsone", "ewilf@mail.com", "232-1227006");
		repository.save(c4);
		Customer c5 = new Customer("Tylar", "Orrell", "70 Bowman Street", "23000", "Flintsone", "t.orrell@mail.com", "232-1227006");
		repository.save(c5);
		Customer c6 = new Customer("Sally", "Gareth", "4 Goldfield Road", "22722", "Flintsone", "s.gareth@mail.com", "232-1227006");
		repository.save(c6);
		Customer c7 = new Customer("Roseanne", "Kimball", "13 Goldfield Road", "22712", "Flintsone", "kimball@mail.com", "232-457133");
		repository.save(c7);
		Customer c8 = new Customer("Leyla", "Elsi", "41 Main Road", "23130", "Flintsone", "l.elsie@mail.com", "232-457133");
		repository.save(c8);
		Customer c9 = new Customer("Kevin", "Dublin", "2 Main Street", "20010", "Flintsone", "k.dublin@mail.com", "232-147127");
		repository.save(c9);
		Customer c10 = new Customer("Laura", "Jones", "34 Venice Street", "20010", "Flintsone", "laura.jones@mail.com", "232-133147");
		repository.save(c10);
		Customer c11 = new Customer("Janet", "Jones", "31 Fifth Street", "20010", "Flintsone", "janet.j@mail.com", "232-457110");
		repository.save(c11);
		Customer c12 = new Customer("Tina", "Dublin", "2 Main Street", "20010", "Flintsone", "t.dublin@mail.com", "232-211555");
		repository.save(c12);
		Customer c13 = new Customer("Tim", "Morrison", "15 Main Boulevard", "33106", "Flintsone", "t.morrison@mail.com", "232-770560");
		repository.save(c13);
		Customer c14 = new Customer("Mike", "Ross", "14 Main Street", "20010", "Flintsone", "mike.r@mail.com", "232-512123");
		repository.save(c14);
		Customer c15 = new Customer("Lisa", "Hurley", "1 Lake Road", "20010", "Flintsone", "lisa.h@mail.com", "232-314330");
		repository.save(c15);
		
		Date dt = new Date();
		DateTime dtOrg = new DateTime(dt);
		Date dtPlusOne = dtOrg.plusDays(1).toDate();			
		Date dtPlusTwo = dtOrg.plusDays(2).toDate();			
		Date dtPlusThree = dtOrg.plusHours(2).toDate();			
		Date dtPlusFour = dtOrg.plusDays(3).toDate();			
		Date dtPlusFive = dtOrg.plusDays(4).toDate();			
		Date dtPlusSix = dtOrg.plusDays(5).toDate();			
		Date dtPlusSeven = dtOrg.plusDays(6).toDate();			

		
		Training t = new Training(new Date(), 60, "Spinning");
		t.setCustomer(c);
		trepository.save(t);
		t = new Training(dtPlusOne, 30, "Gym training");
		t.setCustomer(c);
		trepository.save(t);
		
		t = new Training(dtPlusTwo, 90, "Gym training");
		t.setCustomer(c2);
		trepository.save(t);
		t = new Training(dtPlusThree, 60, "Fitness");
		t.setCustomer(c2);
		trepository.save(t);
		t = new Training(dtPlusFour, 60, "Spinning");
		t.setCustomer(c2);
		trepository.save(t);

		t = new Training(dtPlusFive, 45, "Gym training");
		t.setCustomer(c3);
		trepository.save(t);
		t = new Training(dtPlusSix, 45, "Zumba");
		t.setCustomer(c3);
		trepository.save(t);
		t = new Training(new Date(), 60, "Zumba");
		t.setCustomer(c3);
		trepository.save(t);			
		t = new Training(new Date(), 90, "Jogging");
		t.setCustomer(c6);
		trepository.save(t);
		t = new Training(dtPlusSeven, 60, "Gym training");
		t.setCustomer(c6);
		trepository.save(t);
	}
}
