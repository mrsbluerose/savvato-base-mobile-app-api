package org.haxwell.votingapp.services;

import java.util.List;

import org.haxwell.votingapp.dto.TopicDTO;
import org.haxwell.votingapp.entities.Topic;

public interface TopicService {
	public Topic getById(Long id);

	public List<TopicDTO> getAll();

	public Topic create(Long userId, String name, String description, long expirationInMillis);

	public List<Topic> getByUserId(Long userId);

	public Topic update(Long id, String name, String description, long expirationInMillis);

    public Topic delete(Long id);
}

