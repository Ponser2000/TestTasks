package com.ponser2000.tickets;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Sergey Ponomarev on 24.01.2021
 * @project TestTasks/com.ponser2000.tickets
 */
public class WrapperTickets {

  public WrapperTickets(List<Ticket> tickets) {
    this.tickets = tickets;
  }

  public WrapperTickets(){}

  public List<Ticket> getTickets() {
    return tickets;
  }

  public void setTickets(List<Ticket> tickets) {
    this.tickets = tickets;
  }

  public List<Ticket> tickets;

  public String getMedianTime() throws ParseException {
    int count = 0;
    long sum = 0;
    for (Ticket ticket : tickets) {
      sum +=ticket.getArrivalDateTime().getTime() - ticket.getDepartureDateTime().getTime();
      count++;
    }

    long seconds = (sum / 1000) / count;
    long hh = (seconds / 60 / 60) % 24;
    long mm = (seconds / 60) % 60;
    long ss = seconds % 60;

    return String.format("%02d:%02d:%02d", hh,mm,ss);
  }


  public String getProcetil(int k) throws ParseException {
    double procentil = k / 100d;
    ArrayList<Long> times = new ArrayList<>();

    for (Ticket ticket : tickets) {
      times.add(ticket.getArrivalDateTime().getTime() - ticket.getDepartureDateTime().getTime());
    }
    int count = times.size();

    int n = (int) Math.ceil(procentil * count);

    Collections.sort(times);

    long seconds = times.get(n-1)/1000;

    long hh = (seconds / 60 / 60) % 24;
    long mm = (seconds / 60) % 60;
    long ss = seconds % 60;

    return String.format("%02d:%02d:%02d", hh,mm,ss);
  }
}
