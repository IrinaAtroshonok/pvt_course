package model;

public class Country {
	private int id;
	private String Name;
	private String Code;
	private String Description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "Country: id=" + this.id + ", Name=" + this.Name + ", Code=" + this.Code + ", Description="
				+ this.Description;
	}
}
