package Repository;

public interface ICatalogData {
    AnimeRepository getAnimes();

    GenderRepository getGenders();

    StudioRepository getStudios();
}
