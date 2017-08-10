package www.vikas.service;

import java.util.List;

import www.vikas.model.Supplier;

public interface SupplierServiceInt {
	public void addSupplier(Supplier sup);
	public List<Supplier> getAllSuppliers();
	public Supplier getSupplierById(String supid);
	public void editSupplier(Supplier sup);
	public void deleteSupplier(String supid);
}
