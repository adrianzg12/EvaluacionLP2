package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import interfaceService.IEmpleadoService;
import interfaces.IEmpleado;
import modelo.Empleado;

@Service
public class EmpleadoService implements IEmpleadoService{

	
	@Autowired
	private IEmpleado data;
	
	@Override
	public List<Empleado> listar() {
		return (List<Empleado>)data.findAll();
	}	

	@Override
	public Optional<Empleado> listarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Empleado e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int idEmpleado) {
		// TODO Auto-generated method stub
		
	}
	
	
}

	