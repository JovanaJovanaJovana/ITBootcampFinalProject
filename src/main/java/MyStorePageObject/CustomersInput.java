package MyStorePageObject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CustomersInput {
	
	private static String[] columns = { "First name", "Last name", "Email", "Password", "Address", "City", "State",
			"Zip code", "Country", "Phone number", "Address alias" };

	private static List<Customers> customers = new ArrayList<Customers>();

	public static void main(String[] args) {
		
		customers.add(new Customers("Filip", "Rot", "plsplsplsradi1@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21", "Beograd",
				"Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Mikhail", "Larionov", "plsplsplsradi2@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21", "Beograd",
				"Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Olga", "Rozanova", "plsplsplsradi3@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21", "Beograd",
				"Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Natalia", "Goncharova", "plsplsplsradi4@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Alexandar", "Rodchenko", "plsplsplsradi5@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21", "Beograd",
				"Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Lazar", "Lisicki", "plsplsplsradi6@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21", "Beograd",
				"Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Mladen", "Stilinovic", "plsplsplsradi7@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21", "Beograd",
				"Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Milos", "Jeremic", "plsplsplsradi8@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21", "Beograd",
				"Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Mona", "Lisa", "plsplsplsradi9@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Karl", "Jaspers", "plsplsplsradi10@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Max", "Stirner", "plsplsplsradi11@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Marta", "Nusbaum", "plsplsplsradi12@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Gvido", "Taljabue", "plsplsplsradi13@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Djerdj", "Lukac", "plsplsplsradi14@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Osvald", "Spengler", "plsplsplsradi15@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Amadeo", "Modigliani", "plsplsplsradi16@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Dzon", "Kotigen", "plsplsplsradi17@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Luj Ferdinand", "Selin", "plsplsplsradi18@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Dejvid", "Hjum", "plsplsplsradi19@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Artur", "Sopenhauer", "plsplsplsradi20@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Feliks", "Torres", "plsplsplsradi21@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Fjodor", "Dostojevski", "plsplsplsradi22@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Maks", "Plank", "plsplsplsradi23@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Vasili", "Kandinski", "plsplsplsradi24@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Ilija", "Rjepin", "plsplsplsradi25@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Stevan", "Aleksic", "plsplsplsradi26@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Ljubov", "Popova", "plsplsplsradi27@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Rasa", "Teodosijevic", "plsplsplsradi28@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Naum", "Gabo", "plsplsplsradi29@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));
		customers.add(new Customers("Petar", "Dobrovic", "plsplsplsradi30@gmail.com", "ficinasifra", "Marsala Tolbuhina, 21",
				"Beograd", "Texas", "75001", "Dallas County", "+381644444444", "Marsala Tolbuhina, 21"));

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Customers");

		Row header_row = sheet.createRow(0);

		for (int i = 0; i < columns.length; i++) {
			Cell cell = header_row.createCell(i);
			cell.setCellValue(columns[i]);
		}

		int row_number = 1;

		for (Customers customers : customers) {
			Row row = sheet.createRow(row_number++);
			row.createCell(0).setCellValue(customers.first_name);
			row.createCell(1).setCellValue(customers.last_name);
			row.createCell(2).setCellValue(customers.email);
			row.createCell(3).setCellValue(customers.password);
			row.createCell(4).setCellValue(customers.address);
			row.createCell(5).setCellValue(customers.city);
			row.createCell(6).setCellValue(customers.state);
			row.createCell(7).setCellValue(customers.zip_code);
			row.createCell(8).setCellValue(customers.country);
			row.createCell(9).setCellValue(customers.phone_number);
			row.createCell(10).setCellValue(customers.address_alias);
		}
		
		for(int i =1; i<columns.length; i++) {
			sheet.autoSizeColumn(i);
		}
		
		try (FileOutputStream fo = new FileOutputStream("customers.xlsx")) {
			wb.write(fo);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
