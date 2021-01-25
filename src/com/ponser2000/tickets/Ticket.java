package com.ponser2000.tickets;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author Sergey Ponomarev on 24.01.2021
 * @project TestTasks/com.ponser2000.tickets
 */
public class Ticket {
  public String origin;
  @JsonProperty("origin_name")
  public String originName;
  public String destination;
  @JsonProperty("destination_name")
  public String destinationName;
  @JsonProperty("departure_date")
  public String departureDate;
  @JsonProperty("departure_time")
  public String departureTime;
  @JsonProperty("arrival_date")
  public String arrivalDate;
  @JsonProperty("arrival_time")
  public String arrivalTime;

  public String carrier;
  public int stops;
  public int price;

  public Ticket(){}

  public Ticket(String origin, String originName, String destination,
      String destinationName, String departureDate, String departureTime,
      String arrivalDate, String arrivalTime, String carrier, int stops, int price) {
    this.origin = origin;
    this.originName = originName;
    this.destination = destination;
    this.destinationName = destinationName;
    this.departureDate = departureDate;
    this.departureTime = departureTime;
    this.arrivalDate = arrivalDate;
    this.arrivalTime = arrivalTime;
    this.carrier = carrier;
    this.stops = stops;
    this.price = price;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public String getOriginName() {
    return originName;
  }

  public void setOriginName(String originName) {
    this.originName = originName;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public String getDestinationName() {
    return destinationName;
  }

  public void setDestinationName(String destinationName) {
    this.destinationName = destinationName;
  }

  public String getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(String departureDate) {
    this.departureDate = departureDate;
  }

  public String getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(String departureTime) {
    this.departureTime = departureTime;
  }

  public String getArrivalDate() {
    return arrivalDate;
  }

  public void setArrivalDate(String arrivalDate) {
    this.arrivalDate = arrivalDate;
  }

  public String getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public int getStops() {
    return stops;
  }

  public void setStops(int stops) {
    this.stops = stops;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Ticket{" +
        "origin='" + origin + '\'' +
        ", originName='" + originName + '\'' +
        ", destination='" + destination + '\'' +
        ", destinationName='" + destinationName + '\'' +
        ", departureDate='" + departureDate + '\'' +
        ", departureTime='" + departureTime + '\'' +
        ", arrivalDate='" + arrivalDate + '\'' +
        ", arrivalTime='" + arrivalTime + '\'' +
        ", carrier='" + carrier + '\'' +
        ", stops=" + stops +
        ", price=" + price +
        '}';
  }



  public Date getDepartureDateTime() throws ParseException {
    String string = getDepartureDate() + " " + getDepartureTime();
    DateFormat format = new SimpleDateFormat("dd.MM.yy hh:mm", Locale.ENGLISH);
    Date date = format.parse(string);
    return date;
  }


  public Date getArrivalDateTime() throws ParseException {
    String string = getArrivalDate() + " " + getArrivalTime();
    DateFormat format = new SimpleDateFormat("dd.MM.yy hh:mm", Locale.ENGLISH);
    Date date = format.parse(string);
    return date;
  }

}
