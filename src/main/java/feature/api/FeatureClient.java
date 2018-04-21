package feature.api;

import java.util.ArrayList;
import java.util.List;
import feature.api.Actor;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class FeatureClient {

	public Actor getActorDetails(){
		// TODO Auto-generated method stub
		RestTemplate restTemplate = new RestTemplate();
		Actor actor = (Actor) restTemplate.getForObject("http://localhost:8080/actors/1", Actor.class);
		System.out.println("actor: "+actor);
		return actor;
	}

}
