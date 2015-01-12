package gpinf.dev.data;

import java.io.Serializable;

/**
 * Classe que define uma propriedade, composta pelo par (nome -> valor).
 * 
 * @author Wladimir Leite (GPINF/SP)
 */
public class Property implements Serializable {
	/** Identificador utilizado para serialização da classe */
	private static final long serialVersionUID = 80014119327L;

	/** Nome da propriedade. */
	private final String name;

	/** Valor da propriedade. */
	private final String value;

	/**
	 * Cria nova propriedade.
	 * 
	 * @param name
	 *            nome da propriedade
	 * @param value
	 *            valor correspondente
	 */
	public Property(final String name, final String value) {
		this.name = name;
		this.value = value;
	}

	/**
	 * Retorna representação em texto da propriedade.
	 */
	@Override
	public String toString() {
		return name + ": " + value;
	}

	/**
	 * Obtém nome da propriedade.
	 * 
	 * @return nome da propriedade
	 */
	public String getName() {
		return name;
	}

	/**
	 * Obtém valor da propriedade.
	 * 
	 * @return valor correspondente da propriedade
	 */
	public String getValue() {
		return value;
	}
}
