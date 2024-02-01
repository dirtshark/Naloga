package main.services;


import main.database.entities.Kupec;
import main.database.entities.Naslov;
import main.database.methods.StoreKupec;
import main.database.methods.StoreNaslov;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/naslov")
public class NaslovService {

    // JDBC URL, username, and password of MySQL server
    private final StoreNaslov storeNaslov;
    private final StoreKupec storeKupec;

    @Autowired
    public NaslovService(StoreNaslov storeNaslov, StoreKupec storeKupec) {
        this.storeNaslov = storeNaslov;
        this.storeKupec = storeKupec;
    }
    // Method handling HTTP GET requests. The returned object will be sent
    // to the client as "application/json" media type.
    @PostMapping
    public ResponseEntity<String> createNaslov(@RequestBody Naslov naslov) {

        try{
            storeKupec.insertKupec(new Kupec("31243", "John", "Wick", "2352344", "43545"));
            storeNaslov.insertNaslov(naslov);
            return ResponseEntity.ok("Naslov inserted successfully");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to insert Naslov");
        }
    }

    @GetMapping
    public ResponseEntity<String> getAllNaslovi() {
        try{
            return ResponseEntity.ok("Got all Naslovi successfully");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to get Naslovi");
        }
    }
}