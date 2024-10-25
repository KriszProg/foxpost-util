package hu.foxpost.util.dto;

import java.util.Objects;

public class ClientDto {

    private int id;
    private String clientName;
    private String address;
    private String zipCode;
    private String city;
    private String phone;
    private String email;

    public ClientDto() {}

    public ClientDto(int id, String clientName, String address, String zipCode, String city, String phone, String email) {
        this.id = id;
        this.clientName = clientName;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public ClientDto id(int id) {
        this.id = id;
        return this;
    }

    public String getClientName() {
        return clientName;
    }

    public ClientDto clientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public ClientDto address(String address) {
        this.address = address;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public ClientDto zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public String getCity() {
        return city;
    }

    public ClientDto city(String city) {
        this.city = city;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public ClientDto phone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ClientDto email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ClientDto clientDto = (ClientDto) object;
        return id == clientDto.id
                && Objects.equals(clientName, clientDto.clientName)
                && Objects.equals(address, clientDto.address)
                && Objects.equals(zipCode, clientDto.zipCode)
                && Objects.equals(city, clientDto.city)
                && Objects.equals(phone, clientDto.phone)
                && Objects.equals(email, clientDto.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientName, address, zipCode, city, phone, email);
    }

    @Override
    public String toString() {
        return "ClientDto{" +
                "id=" + id +
                ", clientName='" + clientName + '\'' +
                ", address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
