package com.cleevio.task.Services;

import java.util.List;
import com.cleevio.task.Models.Requests.CreateWatchRequest;
import com.cleevio.task.Models.Responses.CreateWatchResponse;
import com.cleevio.task.Models.Responses.GetWatchesResponse;

public interface IWatchService 
{
	List<GetWatchesResponse> GetWatches();
	
	CreateWatchResponse PostWatch(CreateWatchRequest request);
}
