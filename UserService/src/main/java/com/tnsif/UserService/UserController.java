package com.tnsif.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

@RestController
public class UserController 
{
	@Autowired
	private Userservice userserv;
	private Userservice repo;
	@GetMapping("/userservice")
	public List<User> list()
	{
		return userserv.listAll();
	}
	@PostMapping("/userservice")
	public void add(@RequestBody User userserv1)
	{
		repo.save(userserv1);
	}
	@GetMapping("/userservice/{id}")
	public ResponseEntity<User> get(@PathVariable Integer id)
	{
		try
		{
		User u=userserv.get(id);
		return new ResponseEntity<User>(u,HttpStatus.OK);
	}
	catch(NoResultException e)
	{
		return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	}
  }
	@DeleteMapping("/userservice/{id}")
	public void delete (@PathVariable Integer id)
	{
		userserv.delete(id);
	}
	@PutMapping("/userservice/{id}")
	public ResponseEntity<User> update(@PathVariable Integer id,@RequestBody User update_u)
	{
		try
		{
		User exist_u=userserv.get(id);
		exist_u.setUsername(update_u.getUseraddress());
		exist_u.setUseraddress(update_u.getUseraddress());
		exist_u.setUsercontactnum(update_u.getUsercontactnum());
		exist_u.setUseremail(update_u.getUseremail());
		exist_u.setUserid(update_u.getUserid());
		userserv.update(exist_u);
		return new ResponseEntity<User>(exist_u,HttpStatus.OK);
	    }
	catch(NoResultException e)
	{
		return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	}
  }

}
