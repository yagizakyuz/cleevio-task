package com.cleevio.task.Controllers;

import java.util.List;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cleevio.task.Models.Requests.CreateWatchRequest;
import com.cleevio.task.Models.Responses.CreateWatchResponse;
import com.cleevio.task.Models.Responses.GetWatchesResponse;
import com.cleevio.task.Services.IWatchService;

@RestController
public class WatchController 
{
	private final IWatchService watchService;
	private static final Logger LOGGER = LoggerFactory.getLogger("watch-log");
	
	@Autowired
	public WatchController(IWatchService watchService) 
	{
		this.watchService = watchService;
	}
	
	@GetMapping("/watches")
	public ResponseEntity<List<GetWatchesResponse>> GetWatches()
	{
		return ResponseEntity.status(HttpStatus.OK).body(watchService.GetWatches());
	}
	
	@PostMapping(value = "/watches")
	public ResponseEntity<CreateWatchResponse> CreateWatch(@Valid @RequestBody CreateWatchRequest request)
	{
		CreateWatchResponse response = watchService.PostWatch(request);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(response);

		//return ResponseEntity.status(HttpStatus.OK).body(_watchService.GetWatches());
		
		//return response;
		//throw new ResponseStatusException(HttpStatus.CREATED, "Cause description here");
		//return "Hello Worlsssssd from Spring Boot";
	}
}