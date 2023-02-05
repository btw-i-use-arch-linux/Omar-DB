package com.omar.model.event;

import com.omar.model.db.impl.metadata.Id;
import org.json.JSONObject;

import java.util.List;

public record UpdateEvent (
    Id id,
    JSONObject previousState,
    JSONObject newState,
    String publisherNode,
    String collectionName,
    List<String> publishedTo) implements Event {

  @Override
  public String getPublisher() {
    return this.publisherNode;
  }

  @Override
  public List<String> getPublishedTo() {
    return publishedTo;
  }
}