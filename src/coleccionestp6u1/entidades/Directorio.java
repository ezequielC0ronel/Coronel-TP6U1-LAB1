/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionestp6u1.entidades;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Ezequiel Coronel
 */
public class Directorio {
    private TreeMap<Long,Cliente> listaClientes = new TreeMap<>();
    
    
    
    public Cliente agregarCliente(Long numTelefono, Cliente cliente){
        if(listaClientes.containsKey(numTelefono)){
            return listaClientes.get(numTelefono);
        }
        
        listaClientes.put(numTelefono, cliente);
        return null;
    }
    
    public Cliente buscarCliente(Long numTelefono){
        Set<Long> claves = listaClientes.keySet();
        for(Long c:claves){
            if(Objects.equals(c, numTelefono)){
                return listaClientes.get(c);
                
            }
        }
        return null;
    }
    
    public Set<Long> buscarTelefono(String apellido){
        Set<Long> claves = listaClientes.keySet();
        HashSet<Long> auxiliar = new HashSet<>();
        
        for(Long c:claves){
            if(listaClientes.get(c).getApellidoCliente().equals(apellido)){
                auxiliar.add(c);
            }
        }
        return auxiliar;
    }
    
    public Set<Cliente> buscarClientes(String ciudad){
        Set<Long> claves = listaClientes.keySet();
        HashSet<Cliente> auxiliar = new HashSet<>();
        
        for(Long c:claves){
            if(listaClientes.get(c).getCiudadCliente().equals(ciudad)){
                auxiliar.add(listaClientes.get(c));
            }
        }
        return auxiliar;
    }
    
    public TreeMap<Long,Cliente> borrarCliente(Long dni){
        Set<Long> claves = listaClientes.keySet();
        TreeMap<Long,Cliente> clienteAuxiliar = new TreeMap<>();
        
        for(Long c:claves){
            if(listaClientes.get(c).getDniCliente() == dni){
                clienteAuxiliar.put(c, listaClientes.get(c));
                listaClientes.remove(c);
                break;
            }
        }
        return clienteAuxiliar;
    }
}
