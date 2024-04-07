package com.tnsif.UserService;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository repo;
	
	//Get all the records from the table
	public List<User> listAll()
	{
		return repo.findAll();
	}
	//save the record
	public void save(User userserv)
	{
		repo.save(userserv);
	}
	//retrieving the particular record with uid
		public User get(Integer Uid)
		{
			return repo.findById(Uid).get();
		}
		//deleting the particular record with uid
		public void delete(Integer Uid)
		{
			repo.deleteById(Uid);
		}
		//Update the record
		public void update(User userserv)
		{
			repo.save(userserv);
		}

}

