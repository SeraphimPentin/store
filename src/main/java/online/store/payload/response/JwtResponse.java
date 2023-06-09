package online.store.payload.response;

import java.util.List;

public class JwtResponse {
	private String token;
	private String type = "Bearer";
	private Long id;

	private String firstName;
	private String lastName;

//	private String username;

	private String email;
	private List<String> roles;

	public JwtResponse(String accessToken, Long id, String firstName,  String lastName, String email, List<String> roles) {
		this.token = accessToken;
		this.id = id;
		this.firstName = firstName;
		this.lastName =  lastName;
		this.email = email;
		this.roles = roles;
	}

	public JwtResponse(String accessToken, String email, List<String> roles) {
		this.token = accessToken;
		this.email = email;
		this.roles = roles;
	}

	public String getAccessToken() {
		return token;
	}

	public void setAccessToken(String accessToken) {
		this.token = accessToken;
	}

	public String getTokenType() {
		return type;
	}

	public void setTokenType(String tokenType) {
		this.type = tokenType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getRoles() {
		return roles;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
