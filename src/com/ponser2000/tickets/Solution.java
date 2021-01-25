package com.ponser2000.tickets;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;

/**
 * @author Sergey Ponomarev on 25.01.2021
 * @project TestTasks/com.ponser2000.tickets
 */
public class Solution {

  public static void main(String[] args) throws IOException, ParseException {

    File fileName = new File(args[0]);

    if (!fileName.exists()) {
      System.out.println("Указанный файл не существует");
      return;
    }


    ObjectMapper mapper = new ObjectMapper();
    WrapperTickets tickets = mapper.readValue(fileName, WrapperTickets.class);

    System.out.println("Среднее время полета: " + tickets.getMedianTime());
    System.out.println("90-й процентиль времени полета : " + tickets.getProcetil(90));
  }
}
