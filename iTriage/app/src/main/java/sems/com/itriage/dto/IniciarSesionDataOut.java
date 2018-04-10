package sems.com.itriage.dto;

import java.util.List;



/**
 * Clase que contiene el resultado de la operacion iniciarSesion.
 *
 * @author jabenitez
 */
public class IniciarSesionDataOut
{
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 2L;
    
    /** The usuario logado. */
    private UsuarioLogado usuarioLogado;
    
    /** The ruta ficheros ayuda. */
    private String rutaFicherosAyuda;
    
    /** The sesiones puesto finalizadas. */
    private boolean sesionesPuestoFinalizadas;
    
    /** The sesiones finalizadas. */
    private List<Sesion> sesionesFinalizadas;
    
    /**
     * Instantiates a new iniciar sesion data out.
     */
    public IniciarSesionDataOut()
    {
	}

	/**
	 * Instantiates a new iniciar sesion data out.
	 *
	 * @param dataIn the data in
	 */
	//public IniciarSesionDataOut(DataIn dataIn)
	//{
//		super(dataIn);
//	}
	
	/**
	 * Gets the sesiones finalizadas.
	 *
	 * @return the sesiones finalizadas
	 */
	/* Metodos GET*/
     public List<Sesion> getSesionesFinalizadas()
   {
       return this.sesionesFinalizadas;
   }

    /**
     * Gets the usuario logado.
     *
     * @return the usuario logado
     */
     public UsuarioLogado getUsuarioLogado()
    {
        return this.usuarioLogado;
    }

	/**
	 * Gets the ruta ficheros ayuda.
	 *
	 * @return the ruta ficheros ayuda
	 */
    public String getRutaFicherosAyuda() {
		return rutaFicherosAyuda;
	}
    
    /**
     * Gets the sesiones puesto finalizadas.
     *
     * @return the sesiones puesto finalizadas
     */
    public boolean getSesionesPuestoFinalizadas() {
		return sesionesPuestoFinalizadas;
	}

    /**
     * Sets the usuario logado.
     *
     * @param usuarioLogado the new usuario logado
     */
    /* Metodos SET */
    public void setUsuarioLogado( UsuarioLogado usuarioLogado )
    {
        this.usuarioLogado = usuarioLogado;
    }
    
    /**
     * Sets the ruta ficheros ayuda.
     *
     * @param rutaFicherosAyuda the new ruta ficheros ayuda
     */
    public void setRutaFicherosAyuda(String rutaFicherosAyuda) {
		this.rutaFicherosAyuda = rutaFicherosAyuda;
	}
    
    /**
     * Sets the sesiones puesto finalizadas.
     *
     * @param sesionesPuestoFinalizadas the new sesiones puesto finalizadas
     */
    public void setSesionesPuestoFinalizadas(boolean sesionesPuestoFinalizadas) {
		this.sesionesPuestoFinalizadas = sesionesPuestoFinalizadas;
	}

    /**
     * Sets the sesiones finalizadas.
     *
     * @param sesionesFinalizadas the new sesiones finalizadas
     */
    public void setSesionesFinalizadas(List<Sesion> sesionesFinalizadas) {
		this.sesionesFinalizadas = sesionesFinalizadas;
	}
    
    /* (non-Javadoc)
     * @see com.sems.comun.xml.DataOut#toString()
     */
    @Override
    public String toString()
    {
    	StringBuilder sbr = new StringBuilder();
    	/*
    	 * private UsuarioLogado usuarioLogado;
    private String rutaFicherosAyuda;
    private boolean sesionesPuestoFinalizadas;
    private List<Sesion> sesionesFinalizadas;
    	 */
    	
    	sbr.append("[").append(super.toString()).append("]").
    		append(" USUARIO LOGADO: ").append(usuarioLogado!=null?usuarioLogado.toString():"NULO").
    		append(" | RUTA AYUDA: ").append(rutaFicherosAyuda).
    		append(" | SESION FINALIZADAS? ").append(sesionesPuestoFinalizadas).
    		append(" | SESION FINALIZADAS: [");
    		
    	if( sesionesFinalizadas != null &&
    		!sesionesFinalizadas.isEmpty())
    	{
    		for(Sesion ses:sesionesFinalizadas)
    		{
    			sbr.append(" SESION: ").append(ses.toString()).append(" | ");
    		}
    	}
    	sbr.append("]");
    	return sbr.toString();
    }
}
