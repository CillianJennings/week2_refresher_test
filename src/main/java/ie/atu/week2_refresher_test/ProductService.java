package ie.atu.week2_refresher_test;

/*
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {
    private final List<Product> productList = new ArrayList<>();
    public List<Product> getAllProducts(){
        return productList;
    }
    public void addProduct(Product product){
        productList.add(product);
    }
    public void editProduct(long id, Product updatedProduct) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setName(updatedProduct.getName());
                product.setPrice(updatedProduct.getPrice());
            }
        }
    }
    public void deleteProduct(long id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                productList.remove(product);
            }
        }
    }
}
*/

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> productList = new ArrayList<>();

    public List<Product> getAllProducts() {
        return productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public boolean editProduct(long id, Product updatedProduct) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setName(updatedProduct.getName());
                product.setPrice(updatedProduct.getPrice());
                return true;
            }
        }
        return false;
    }

    public boolean deleteProduct(long id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                productList.remove(product);
                return true;
            }
        }
        return false;
    }

}
