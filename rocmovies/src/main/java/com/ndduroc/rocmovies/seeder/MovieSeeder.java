//package com.ndduroc.rocmovies.configuration;
//
//import com.ndduroc.rocmovies.entity.Movie;
//import com.ndduroc.rocmovies.repository.MovieRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class MovieSeeder {
//
//    @Bean
//    CommandLineRunner seedMovies(MovieRepository movieRepo) {
//        return args -> {
//            movieRepo.save(new Movie(1, "Cloud Atlas", 1, 2012,
//                    "https://3238leblogdemarvelll-1278.kxcdn.com/wp-content/uploads/2013/02/cloud-atlas-banniere.jpg"));
//            movieRepo.save(new Movie(2, "Shutter Island", 2, 2010,
//                    "https://media.gqmagazine.fr/photos/5b991fdce423e20011353afb/4:3/w_744,h_558,c_limit/hbo_pr__pare_une_s__rie_bas__e_sur_shutter_island_8519.jpeg"));
//            movieRepo.save(new Movie(2, "Interstellar", 1, 2018,
//                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTWUkn7AAgv_RRdLm0MiSSSu3kQhSqfNXDf4A&s"));
//            movieRepo.save(new Movie(2, "Pulp Fiction", 3, 2001,
//                    "https://i0.wp.com/maze.fr/wp-content/uploads/2020/05/18876752.jpg-r_1280_720-f_jpg-q_x-xxyxx.jpg?resize=529%2C361&ssl=1"));
//            movieRepo.save(new Movie(2, "Mulholland Drive", 2, 2001,
//                    "https://focus.telerama.fr/2022/02/27/1/14/977/651/1200/0/60/0/a1a41f4_1645969640850-reprise-de-mulholland-drive-m450103.jpg"));
//            movieRepo.save(new Movie(2,"Inception", 1, 2010,
//                    "https://media.tenor.com/nsQ57a43PG0AAAAM/funny-memes-woody.gif"));
//            movieRepo.save(new Movie(2,"The Matrix", 1, 1999,
//                    "https://image.tmdb.org/t/p/w500/f89U3ADr1oiB1s9GkdPOEpXUk5H.jpg"));
//            movieRepo.save(new Movie(2,"The Dark Knight", 3, 2008,
//                    "https://image.tmdb.org/t/p/w500/qJ2tW6WMUDux911r6m7haRef0WH.jpg"));
//            movieRepo.save(new Movie(2,"Fight Club", 4, 1999,
//                    "https://image.tmdb.org/t/p/w500/bptfVGEQuv6vDTIMVCHjJ9Dz8PX.jpg"));
//            movieRepo.save(new Movie(2,"The Godfather", 4, 1972,
//                    "https://image.tmdb.org/t/p/w500/3bhkrj58Vtu7enYsRolD1fZdja1.jpg"));
//            movieRepo.save(new Movie(2,"The Shawshank Redemption", 4, 1994,
//                    "https://image.tmdb.org/t/p/w500/q6y0Go1tsGEsmtFryDOJo3dEmqu.jpg"));
//            movieRepo.save(new Movie(2,"Forrest Gump", 4, 1994,
//                    "https://image.tmdb.org/t/p/w500/saHP97rTPS5eLmrLQEcANmKrsFl.jpg"));
//            movieRepo.save(new Movie(2,"The Silence of the Lambs", 2, 1991,
//                    "https://image.tmdb.org/t/p/w500/rplLJ2hPcOQmkFhTqUte0MkEaO2.jpg"));
//            movieRepo.save(new Movie(2,"Se7en", 2, 1995,
//                    "https://image.tmdb.org/t/p/w500/6yoghtyTpznpBik8EngEmJskVUO.jpg"));
//            movieRepo.save(new Movie(2,"Gladiator", 3, 2000,
//                    "https://image.tmdb.org/t/p/w500/ty8TGRuvJLPUmAR1H1nRIsgwvim.jpg"));
//            movieRepo.save(new Movie(2,"Saving Private Ryan", 3, 1998,
//                    "https://media.tenor.com/6Q-6vsQeJJIAAAAM/tigre-fumando.gif"));
//            movieRepo.save(new Movie(2,"The Prestige", 1, 2006,
//                    "https://image.tmdb.org/t/p/w500/5MXyQfz8xUP3dIFPTubhTsbFY6N.jpg"));
//            movieRepo.save(new Movie(2,"Memento", 2, 2000,
//                    "https://image.tmdb.org/t/p/w500/fQMSaP88cf1nz4qwuNEEFtazuDM.jpg"));
//            movieRepo.save(new Movie(2,"Whiplash", 4, 2014,
//                    "https://image.tmdb.org/t/p/w500/oPxnRhyAIzJKGUEdSiwTJQfDyyG.jpg"));
//            movieRepo.save(new Movie(2,"La La Land", 4, 2016,
//                    "https://image.tmdb.org/t/p/w500/uDO8zWDcS3cRRvuI0XbbUAT4lO0.jpg"));
//            movieRepo.save(new Movie(2,"Parasite", 2, 2019,
//                    "https://image.tmdb.org/t/p/w500/7IiTTgloJzvGI1TAYymCfbfl3vT.jpg"));
//            movieRepo.save(new Movie(2,"Joker", 4, 2019,
//                    "https://image.tmdb.org/t/p/w500/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg"));
//            movieRepo.save(new Movie(2,"Avengers: Endgame", 3, 2019,
//                    "https://image.tmdb.org/t/p/w500/or06FN3Dka5tukK1e9sl16pB3iy.jpg"));
//            movieRepo.save(new Movie(2,"Iron Man", 3, 2008,
//                    "https://image.tmdb.org/t/p/w500/78lPtwv72eTNqFW9COBYI0dWDJa.jpg"));
//            movieRepo.save(new Movie(2,"Doctor Strange", 1, 2016,
//                    "https://image.tmdb.org/t/p/w500/4PiiNGXj1KENTmCBHeN6Mskj2Fq.jpg"));
//            movieRepo.save(new Movie(2,"Black Panther", 3, 2018,
//                    "https://image.tmdb.org/t/p/w500/uxzzxijgPIY7slzFvMotPv8wjKA.jpg"));
//            movieRepo.save(new Movie(2,"The Wolf of Wall Street", 4, 2013,
//                    "https://image.tmdb.org/t/p/w500/pWHf4E2fOelpq0sxod9Q7IuZQG7.jpg"));
//            movieRepo.save(new Movie(2,"The Revenant", 3, 2015,
//                    "https://image.tmdb.org/t/p/w500/oXUWEc5i3wYyFnL1Ycu8ppxxPvs.jpg"));
//            movieRepo.save(new Movie(2,"Django Unchained", 3, 2012,
//                    "https://image.tmdb.org/t/p/w500/7oWY8VDWW7thTzWh3OKYRkWUlD5.jpg"));
//            movieRepo.save(new Movie(2,"The Hateful Eight", 2, 2015,
//                    "https://image.tmdb.org/t/p/w500/fqe8JxDNO8B8QfOGTdjhPK4F2ak.jpg"));
//            movieRepo.save(new Movie(2,"Blade Runner 2049", 1, 2017,
//                    "https://image.tmdb.org/t/p/w500/gajva2L0rPYkEWjzgFlBXCAVBE5.jpg"));
//            movieRepo.save(new Movie(2,"Arrival", 1, 2016,
//                    "https://image.tmdb.org/t/p/w500/x2FJsf1ElAgr63Y3PNPtJcuk9qC.jpg"));
//            movieRepo.save(new Movie(2,"Mad Max: Fury Road", 3, 2015,
//                    "https://image.tmdb.org/t/p/w500/8tZYtuWezp8JbcsvHYO0O46tFbo.jpg"));
//            movieRepo.save(new Movie(2,"The Social Network", 4, 2010,
//                    "https://image.tmdb.org/t/p/w500/n0ybibhJtQ5icDqTp8eRytcIHJx.jpg"));
//            movieRepo.save(new Movie(2,"The Grand Budapest Hotel", 4, 2014,
//                    "https://image.tmdb.org/t/p/w500/nX5XotM9yprCKarRH4fzOq1VM1"));
//
//        };
//    }
//}
