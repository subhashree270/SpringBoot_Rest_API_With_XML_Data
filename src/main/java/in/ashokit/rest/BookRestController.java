package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Book;

@RestController
public class BookRestController {
	@PostMapping(value="/books",consumes={"application/xml",
			"application/json"} , produces="text/plain")
	public String addBook(@RequestBody Book b) {
         System.out.println(b);
		//db logic to adding book data
		return "Book Added...";
		
	}
	@GetMapping(value="/books",produces= {"application/xml",
			"application/json"})
	public Book getBook() {
		Book book=new Book(101,"Java",450,"Gosling");
		return book;
	}

}
