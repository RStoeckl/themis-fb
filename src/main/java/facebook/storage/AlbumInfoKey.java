package facebook.storage;

public enum AlbumInfoKey implements SerializerKey
{
	COUNT("Anzahl der Fotos", Datatype.NUMBER),
	COVER_PHOTO_ID("ID des Covers", Datatype.OTHER),
	CREATED("Erstellungsdatum", Datatype.DATE),
	DESCRIPTION("Beschreibung", Datatype.OTHER),
	ORIGINAL_LINK("Originaler Link", Datatype.LINK),
	PRIVACY("öffentliche Zugänglichkeit", Datatype.OTHER),
	LAST_UPDATE("Zuletzt bearbeitet", Datatype.DATE),
	DIRECTORY("Verzeichnis", Datatype.OTHER),
	NAME("Name", Datatype.OTHER),
	LOCAL_COUNT("Anzahl der lokalen Fotos", Datatype.NUMBER),
	COMES_FROM("Erstellt von", Datatype.CFT),
	LOCATION("Ort", Datatype.OTHER);

	private String label;
	private Datatype type;

	private AlbumInfoKey(String label, Datatype type)
	{
		this.label = label;
		this.type = type;
	}

	public String getLabel()
	{
		return label;
	}

	public Datatype getType()
	{
		return type;
	}
}