package edu.cvtc.web.util;
/**
 * 
 */


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import edu.cvtc.web.model.Movie;

/**
 * @author Drewry Pope
 *
 */

public class WorkbookUtility {
	
	public static final String INPUT_FILE = "/assets/spreadsheets/Movies.xlsx";
	
	public static List<Movie> retrieveMoviesFromWorkbook(final File inputFile) throws InvalidFormatException, IOException {
		final List<Movie> movies = new ArrayList<>();
		final Workbook workbook = WorkbookFactory.create(inputFile);
		
		final Sheet sheet = workbook.getSheetAt(0);
		
		for (final Row row : sheet) {
			final String title = row.getCell(0).getStringCellValue();
			final String director = row.getCell(1).getStringCellValue();
			final int lengthInMinutes = (int)row.getCell(2).getNumericCellValue();
			final Movie movie = new Movie(title, director, lengthInMinutes);
		
			movies.add(movie);
		}
		return movies;
	}
}