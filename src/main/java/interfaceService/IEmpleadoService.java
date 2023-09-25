package interfaceService;

import java.util.List;
import java.util.Optional;

import modelo.Empleado;

public interface IEmpleadoService {
	public List<Empleado>listar();
	public Optional<Empleado>listarId(int id);
	public int save(Empleado e);
	public void delete(int id);
}
