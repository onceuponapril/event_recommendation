
package entity;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Item {
	private String itemId;
	private String name;
	private double rating;
	private String address;
	private Set<String> categories;
	private String imageUrl;
	private String url;
	private double distance;

	private Item(ItemBuilder builder) {
		this.setItemId(builder.itemId);
		this.setName(builder.name);
		this.setRating(builder.rating);
		this.setAddress(builder.address);
		this.setCategories(builder.categories);
		this.setImageUrl(builder.imageUrl);
		this.setUrl(builder.url);
		this.setDistance(builder.distance);
	}
	public JSONObject toJSONObject() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("item_id", itemId);
			obj.put("name", name);
			obj.put("rating", rating);
			obj.put("address", address);
			obj.put("categories", new JSONArray(categories));
			obj.put("image_url", imageUrl);
			obj.put("url", url);
			obj.put("distance", distance);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}



	public String getItemId() {
		return itemId;
	}


	public void setItemId(String itemId) {
		this.itemId = itemId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Set<String> getCategories() {
		return categories;
	}


	public void setCategories(Set<String> categories) {
		this.categories = categories;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public double getDistance() {
		return distance;
	}


	public void setDistance(double distance) {
		this.distance = distance;
	}


	public static class ItemBuilder {
		private String itemId;
		private String name;
		private double rating;
		private String address;
		private Set<String> categories;
		private String imageUrl;
		private String url;
		private double distance;
		
		
		public ItemBuilder setItemId(String itemId) {
			this.itemId = itemId;
			return this;
		}
		public ItemBuilder setName(String name) {
			this.name = name;
			return this;
		}
		public ItemBuilder setRating(double rating) {
			this.rating = rating;
			return this;
		}
		public ItemBuilder setAddress(String address) {
			this.address = address;
			return this;
		}
		public ItemBuilder setCategories(Set<String> categories) {
			this.categories = categories;
			return this;
		}
		public ItemBuilder setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
			return this;
		}
		public ItemBuilder setUrl(String url) {
			this.url = url;
			return this;
		}
		public ItemBuilder setDistance(double distance) {
			this.distance = distance;
			return this;
		}
		
		public Item build() {
			return new Item(this);
		}

	}

	
}


