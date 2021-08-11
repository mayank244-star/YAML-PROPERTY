package file;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class yamltest {

	 public static void main(String[] args) throws FileNotFoundException {
	        Yaml yaml = new Yaml();
	        InputStream inputStream = new FileInputStream("C:\\Users\\user\\project\\YAMLvsPROPERTY\\src\\main\\resources\\new.yaml");
	       // System.out.println(inputStream);

	       HashMap yamlMap = yaml.load(inputStream);
	        //for (Object o : yamlMap.entrySet()) {
	         //   System.out.println(o);
	       // }
	        HashMap products = (HashMap) yamlMap.get("products");
	        System.out.println(products);
	  	  
	        HashMap product = (HashMap) products.get("ProductB");
	        System.out.println(product);
	  	  
	        HashMap suite = (HashMap) product.get("suite");
	        System.out.println(suite);
	  	  HashMap suiteName = (HashMap) suite.get("SuiteName_K");
	  	System.out.println(suiteName);
	  	String environment = (String) suiteName.get("environment_2");
	        System.out.println(environment);
	    }
}
