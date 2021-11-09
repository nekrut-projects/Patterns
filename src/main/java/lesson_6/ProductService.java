package lesson_6;

public class ProductService {
    private static final ProductIdentityMap identityMap = ProductIdentityMap.getInstance();
    private static final ProductDataMapper dataMapper = ProductDataMapper.getInstance(new ServerDB());

    public Product findById(int id) throws ResourceNotFoundException {
        if (identityMap.isContainProduct(id)){
            return identityMap.getProduct(id);
        }
        return dataMapper.findById(id);
    }

    public void add(Product product){
        dataMapper.add(product);
    }
}
