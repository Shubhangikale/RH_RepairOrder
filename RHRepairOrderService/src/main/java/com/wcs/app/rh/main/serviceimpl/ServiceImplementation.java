package com.wcs.app.rh.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcs.app.rh.main.models.District;
import com.wcs.app.rh.main.models.ROInvoice;
import com.wcs.app.rh.main.models.States;
import com.wcs.app.rh.main.models.VehicleModel;
import com.wcs.app.rh.main.models.VehicleType;
import com.wcs.app.rh.main.repository.CustomerLabourRepo;
import com.wcs.app.rh.main.repository.CustomerRepo;
import com.wcs.app.rh.main.repository.CustomerServiceDetailsRepo;
import com.wcs.app.rh.main.repository.CustomerVehicleRepo;
import com.wcs.app.rh.main.repository.DistrictRepo;
import com.wcs.app.rh.main.repository.GatePassRepo;
import com.wcs.app.rh.main.repository.InvoiceMasterRepo;

import com.wcs.app.rh.main.repository.ProductsRepo;
import com.wcs.app.rh.main.repository.ROInvoiceRepo;
import com.wcs.app.rh.main.repository.RoleRepo;
import com.wcs.app.rh.main.repository.ServicePackagesRepo;
import com.wcs.app.rh.main.repository.StatesRepository;
import com.wcs.app.rh.main.repository.StatusRepo;
import com.wcs.app.rh.main.repository.SystemUsersRepo;
import com.wcs.app.rh.main.repository.TaxTypeRepo;
import com.wcs.app.rh.main.repository.VehicleModelRepo;
import com.wcs.app.rh.main.repository.VehicleTypeRepo;
import com.wcs.app.rh.main.serviceinterface.ServiceInterface;


@Service
public class ServiceImplementation implements ServiceInterface {

	@Autowired
	private StatesRepository statesRepository;
	@Autowired
	private CustomerLabourRepo customerLabourRepo;
	@Autowired
	private CustomerRepo customerRepo;
	@Autowired
	private CustomerServiceDetailsRepo customerServiceDetailsRepo;
	@Autowired
	private CustomerVehicleRepo customerVehicleRepo;
	@Autowired
	private DistrictRepo districtRepo;
	@Autowired
	private GatePassRepo gatePassRepo;
	@Autowired
	private InvoiceMasterRepo invoiceMasterRepo;

	@Autowired
	private ProductsRepo productsRepo;
	@Autowired
	private ROInvoiceRepo roInvoiceRepo;
	@Autowired
	private RoleRepo roleRepo;
	@Autowired
	private ServicePackagesRepo servicePackagesRepo;
	@Autowired
	private StatusRepo statusRepo;
	@Autowired
	private SystemUsersRepo systemUsersRepo;
	@Autowired
	private TaxTypeRepo taxTypeRepo;
	@Autowired
	private VehicleModelRepo vehicleModelRepo;
	@Autowired
	private VehicleTypeRepo vehicleTypeRepo;
	
	@Override
	public District findDistById(int id) {
		// TODO Auto-generated method stub
		return districtRepo.findById(id);
	}
	@Override
	public States findStateById(int id) {
		// TODO Auto-generated method stub
		return statesRepository.findById(id);
	}
	@Override
	public List<States> findAllStates() {
		// TODO Auto-generated method stub
		return (List<States>) statesRepository.findAll();
	}
//	@Override
//	public List<District> findAllDist(int state) {
//		// TODO Auto-generated method stub
//		return districtRepo.findAllByState(state);
//	}
	@Override
	public List<District> findAllByState_id(int id) {
		// TODO Auto-generated method stub
		return districtRepo.findAllByState_id(id);
	}
	@Override
	public List<VehicleModel> findAllVehicleModel() {
		// TODO Auto-generated method stub
		List<VehicleModel> list= (List<VehicleModel>) vehicleModelRepo.findAll();
		return list;
	}
	@Override
	public List<VehicleType> findAllByModel_id(int id) {
		// TODO Auto-generated method stub
		return vehicleTypeRepo.findAllByModel_id(id);
	}
	@Override
	public List<ROInvoice> findAllROInvoice() {
		// TODO Auto-generated method stub
		List<ROInvoice> list=(List<ROInvoice>) roInvoiceRepo.findAll();
		return list;
	}


}
