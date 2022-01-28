package com.cleevio.task.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleevio.task.Models.Watch;
import com.cleevio.task.Models.Requests.CreateWatchRequest;
import com.cleevio.task.Models.Responses.CreateWatchResponse;
import com.cleevio.task.Models.Responses.GetWatchesResponse;
import com.cleevio.task.Repositories.WatchRepository;

@Service
public class WatchService implements IWatchService 
{
	private final WatchRepository watchRepository;
	
	@Autowired
	public WatchService(WatchRepository watchRepository) 
	{
		this.watchRepository = watchRepository;
	}

	public List<GetWatchesResponse> GetWatches() 
	{
		List<Watch> watches = watchRepository.findAll();
		
		List<GetWatchesResponse> responseList = new ArrayList<GetWatchesResponse>();
		for (Watch watch : watches) 
		{
			GetWatchesResponse response = new GetWatchesResponse();
			response.setId(watch.getId());
			response.setTitle(watch.getTitle());
			response.setPrice(watch.getPrice());
			response.setDescription(watch.getDescription());
			response.setFountain(watch.getFountain());
			response.setTransactionDate(watch.getTransactionDate());
			
			responseList.add(response);
		}
		
		return responseList;
	}
	
	public CreateWatchResponse PostWatch(CreateWatchRequest request) 
	{
		Watch watch = new Watch();
		watch.setDescription(request.getDescription());
		watch.setFountain(request.getFountain());
		watch.setPrice(request.getPrice());
		watch.setTitle(request.getTitle());
		watch.setTransactionDate(request.getTransactionDate());
		
		long id = watchRepository.save(watch).getId();
		
		CreateWatchResponse watchResponse = new CreateWatchResponse() 
		{{
			setId(id);
		}};
		
		return watchResponse;
	}
}
