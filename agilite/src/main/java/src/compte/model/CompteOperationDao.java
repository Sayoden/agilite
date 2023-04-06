package src.compte.model;

import java.math.BigDecimal;

import src.client.model.ClientDao;

public class CompteOperationDao {
	private Integer id;
	private String libelle;
	private BigDecimal montant;
	private ClientDao destinataire;
	private ClientDao emetteur;

	public CompteOperationDao(Integer id, String libelle, BigDecimal montant, ClientDao destinataire, ClientDao emetteur) throws Exception {
		super();
		this.id = id;
		this.libelle = libelle;
		this.montant = montant;
		if (destinataire != null && emetteur != null) {
			this.destinataire = destinataire;
			this.emetteur = emetteur;
		} else throw new Exception("Un ou plusieurs identifiants n'existe pas");

	}

	public CompteOperationDao() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public BigDecimal getMontant() {
		return montant;
	}

	public void setMontant(BigDecimal montant) {
		this.montant = montant;
	}

	public ClientDao getDestinataire() {
		return destinataire;
	}

	public void setDestinataire(ClientDao destinataire) {
		this.destinataire = destinataire;
	}

	public ClientDao getEmetteur() {
		return emetteur;
	}

	public void setEmetteur(ClientDao emetteur) {
		this.emetteur = emetteur;
	}

	@Override
	public String toString() {
		return "CompteOperationDao [id=" + id + ", libelle=" + libelle + ", montant=" + montant + ", destinataire=" + destinataire + ", emetteur=" + emetteur + "]";
	}

}
