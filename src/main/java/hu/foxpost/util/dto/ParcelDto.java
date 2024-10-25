package hu.foxpost.util.dto;

import java.util.Objects;

public class ParcelDto {

    private int id;
    private String parcelNo;
    private ClientDto sender;
    private ClientDto receiver;

    public ParcelDto() {}

    public ParcelDto(int id, String parcelNo, ClientDto sender, ClientDto receiver) {
        this.id = id;
        this.parcelNo = parcelNo;
        this.sender = sender;
        this.receiver = receiver;
    }

    public int getId() {
        return id;
    }

    public ParcelDto id(int id) {
        this.id = id;
        return this;
    }

    public String getParcelNo() {
        return parcelNo;
    }

    public ParcelDto parcelNo(String parcelNo) {
        this.parcelNo = parcelNo;
        return this;
    }

    public ClientDto getSender() {
        return sender;
    }

    public ParcelDto sender(ClientDto sender) {
        this.sender = sender;
        return this;
    }

    public ClientDto getReceiver() {
        return receiver;
    }

    public ParcelDto receiver(ClientDto receiver) {
        this.receiver = receiver;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ParcelDto parcelDto = (ParcelDto) object;
        return id == parcelDto.id
                && Objects.equals(parcelNo, parcelDto.parcelNo)
                && Objects.equals(sender, parcelDto.sender)
                && Objects.equals(receiver, parcelDto.receiver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parcelNo, sender, receiver);
    }

    @Override
    public String toString() {
        return "ParcelDto{" +
                "id=" + id +
                ", parcelNo='" + parcelNo + '\'' +
                ", sender=" + sender +
                ", receiver=" + receiver +
                '}';
    }

}
