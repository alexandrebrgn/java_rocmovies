//package com.ndduroc.rocmovies.service;
//
//import com.ndduroc.rocmovies.entity.Movie;
//import com.ndduroc.rocmovies.entity.MovieDTO;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//
//@Service
//public class MovieService2 implements IMovieService {
//    /**
//     * Fournit une liste de films 'en dur'
//     * en attendant de pouvoir utiliser une base de données
//     * @return
//     */
//
//    private static List<Movie> getDefaultList()
//    {
//        List<Movie> movies = new ArrayList<>();
//        movies.add(new Movie(1,"Cloud Atlas", 1,2012, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.allocine.fr%2Ffilm%2Ffichefilm_gen_cfilm%3D143067.html&psig=AOvVaw3S7r-Wqp6-D1ZBFHdIxPab&ust=1764062486444000&source=images&cd=vfe&opi=89978449&ved=0CBUQjRxqFwoTCKDD0YC7ipEDFQAAAAAdAAAAABAE"));
//        movies.add(new Movie(2,"Shutter Island", 2,2010, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.gqmagazine.fr%2Fpop-culture%2Fcinema%2Farticles%2Fshutter-island%2F2758&psig=AOvVaw3g8JdX8R4-SKyRiFtaThFq&ust=1764062506394000&source=images&cd=vfe&opi=89978449&ved=0CBUQjRxqFwoTCOjx5o27ipEDFQAAAAAdAAAAABAE"));
//        movies.add(new Movie(3,"Interstellar", 1,2018, "https://www.google.com/url?sa=i&url=https%3A%2F%2Flegolasgamer.com%2Fcine-critique-interstellar%2F&psig=AOvVaw2MTu4qz4KNk5rc_zIzjGc6&ust=1764062529139000&source=images&cd=vfe&opi=89978449&ved=0CBUQjRxqFwoTCPjW9JS7ipEDFQAAAAAdAAAAABAE"));
//        movies.add(new Movie(4,"Pulp Fiction", 3,2001, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pickx.be%2Ffr%2F2209327%2Fpulp-fiction-fete-ses-30-ans-5-choses-a-savoir-sur-le-film-culte-de-quentin-tarantino&psig=AOvVaw0h142iaxY4dvpRX3rkjrj3&ust=1764062543837000&source=images&cd=vfe&opi=89978449&ved=0CBUQjRxqFwoTCIiQ4Z27ipEDFQAAAAAdAAAAABAE"));
//        movies.add(new Movie(5,"Mulholland Drive", 2,2001, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.telerama.fr%2Fcinema%2Ffilms%2Fmulholland-drive%2C52832.php&psig=AOvVaw3ZXW-w49Ueka3uthmNthL6&ust=1764062562625000&source=images&cd=vfe&opi=89978449&ved=0CBUQjRxqFwoTCNiLo6a7ipEDFQAAAAAdAAAAABAX"));
//
//        return movies;
//    }
//
//
//    private List<Movie> movieList;
//
//    /**
//     * Liste complète de tous les films
//     */
//    @Override
//    public List<Movie> getListMovies(){
//        if (movieList == null)
//        {
//            movieList = getDefaultList();
//        }
//        return movieList;
//    }
//
//    @Override
//    public Optional<Movie> getMovieById(long id){
//        return getListMovies().stream().filter(m -> m.getIdMovie()==id).findFirst();
//    }
//
//    @Override
//    public List<Movie> getMovieByStyle(Integer style) {
//        return getListMovies().stream().filter(m -> m.getStyle()==style).collect(Collectors.toList());
//    }
//
//
//    public MovieService2() {
//        System.out.println("Création du service MovieService");
//    }
//
//    @Override
//    public List<Movie> addMovie(MovieDTO movieDTO) {
//        Movie movie = new Movie(movieDTO.idMovie, movieDTO.title, movieDTO.style, movieDTO.productionYear, movieDTO.image);
//        getListMovies().add(movie);
//        return getListMovies();
//    }
//
//    @Override
//    public List<Movie> getMovieBetween(int start, int end) {
//        return List.of();
//    }
//
//}
