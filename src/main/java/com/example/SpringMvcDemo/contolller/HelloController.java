package com.example.SpringMvcDemo.contolller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
	
	//ArrayList<Employee> usersList = new ArrayList<Employee>();
	Map<Integer,Employee> usersList = new HashMap<>();	
	
	@GetMapping("/users/{id}")
	public Employee getUsers(@PathVariable int id)
	{
		if(usersList.containsKey(id))
		{
			return usersList.get(id);
		}
		return null;
		
	}
	@GetMapping("/users")
	public Map<Integer, Employee> getUsers()
	{
			return usersList;
	}
	
	@PostMapping("/user")
	public String createUser(@RequestParam Integer id, @RequestParam String name,@RequestParam String roll,@RequestParam String company,@RequestParam String baseLocation)
	{
		if(!usersList.containsKey(id))
		{
		usersList.put(id,new Employee(name,roll,company,baseLocation));
		return "User added successfully";
		}
		
		return "User already exist with this id";
			
	}
	
	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable Integer id)
	{
		if(usersList.containsKey(id))
		{
			usersList.remove(id);
		}
		return "User deleted successfully";
	}	
	@DeleteMapping("/users")
	public String deleteAllUser()
	{
			usersList.clear();
			return "All User deleted successfully";
	}
	@PutMapping("/user" )
	public String updateUserDetails(@RequestParam Integer id, @RequestParam String name,@RequestParam String roll,@RequestParam String company,@RequestParam String baseLocation)
	{
		if(usersList.containsKey(id))
			{
				
				usersList.replace(id, new Employee(name,roll,company,baseLocation));
				return "User details updated successfully";
			}
		
		return "This User does not exist";
		
	}


}
