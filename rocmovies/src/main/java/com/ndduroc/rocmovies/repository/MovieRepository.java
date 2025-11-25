package com.ndduroc.rocmovies.repository;
import com.ndduroc.rocmovies.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

//    private final Movie[] movies = new Movie[] {
//            new Movie(1,"Cloud Atlas",MovieStyles.SF,2012, "https://3238leblogdemarvelll-1278.kxcdn.com/wp-content/uploads/2013/02/cloud-atlas-banniere.jpg"),
//            new Movie(2,"Shutter Island", MovieStyles.THRILLER,2010, "https://media.gqmagazine.fr/photos/5b991fdce423e20011353afb/4:3/w_744,h_558,c_limit/hbo_pr__pare_une_s__rie_bas__e_sur_shutter_island_8519.jpeg"),
//            new Movie(3,"Interstellar", MovieStyles.SF,2018, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTWUkn7AAgv_RRdLm0MiSSSu3kQhSqfNXDf4A&s"),
//            new Movie(4,"Pulp Fiction", MovieStyles.ACTION,2001, "https://i0.wp.com/maze.fr/wp-content/uploads/2020/05/18876752.jpg-r_1280_720-f_jpg-q_x-xxyxx.jpg?resize=529%2C361&ssl=1"),
//            new Movie(5,"Mulholland Drive", MovieStyles.THRILLER,2001, "https://focus.telerama.fr/2022/02/27/1/14/977/651/1200/0/60/0/a1a41f4_1645969640850-reprise-de-mulholland-drive-m450103.jpg"),
//            new Movie(6,"Inception", MovieStyles.SF,2010,"https://media.tenor.com/nsQ57a43PG0AAAAM/funny-memes-woody.gif"),
//            new Movie(7,"The Matrix", MovieStyles.SF,1999,"https://image.tmdb.org/t/p/w500/f89U3ADr1oiB1s9GkdPOEpXUk5H.jpg"),
//            new Movie(8,"The Dark Knight", MovieStyles.ACTION,2008,"https://image.tmdb.org/t/p/w500/qJ2tW6WMUDux911r6m7haRef0WH.jpg"),
//            new Movie(9,"Fight Club", MovieStyles.DRAME,1999,"https://image.tmdb.org/t/p/w500/bptfVGEQuv6vDTIMVCHjJ9Dz8PX.jpg"),
//            new Movie(10,"The Godfather", MovieStyles.DRAME,1972,"https://image.tmdb.org/t/p/w500/3bhkrj58Vtu7enYsRolD1fZdja1.jpg"),
//            new Movie(11,"The Shawshank Redemption", MovieStyles.DRAME,1994,"https://image.tmdb.org/t/p/w500/q6y0Go1tsGEsmtFryDOJo3dEmqu.jpg"),
//            new Movie(12,"Forrest Gump", MovieStyles.COMEDIE,1994,"https://image.tmdb.org/t/p/w500/saHP97rTPS5eLmrLQEcANmKrsFl.jpg"),
//            new Movie(13,"The Silence of the Lambs", MovieStyles.THRILLER,1991,"https://image.tmdb.org/t/p/w500/rplLJ2hPcOQmkFhTqUte0MkEaO2.jpg"),
//            new Movie(14,"Se7en", MovieStyles.THRILLER,1995,"https://image.tmdb.org/t/p/w500/6yoghtyTpznpBik8EngEmJskVUO.jpg"),
//            new Movie(15,"Gladiator", MovieStyles.ACTION,2000,"https://image.tmdb.org/t/p/w500/ty8TGRuvJLPUmAR1H1nRIsgwvim.jpg"),
//            new Movie(16,"Saving Private Ryan", MovieStyles.ACTION,1998,"https://media.tenor.com/6Q-6vsQeJJIAAAAM/tigre-fumando.gif"),
//            new Movie(17,"The Prestige", MovieStyles.SF,2006,"https://image.tmdb.org/t/p/w500/5MXyQfz8xUP3dIFPTubhTsbFY6N.jpg"),
//            new Movie(18,"Memento", MovieStyles.THRILLER,2000,"https://image.tmdb.org/t/p/w500/fQMSaP88cf1nz4qwuNEEFtazuDM.jpg"),
//            new Movie(19,"Whiplash", MovieStyles.DRAME,2014,"https://image.tmdb.org/t/p/w500/oPxnRhyAIzJKGUEdSiwTJQfDyyG.jpg"),
//            new Movie(20,"La La Land", MovieStyles.COMEDIE,2016,"https://image.tmdb.org/t/p/w500/uDO8zWDcS3cRRvuI0XbbUAT4lO0.jpg"),
//            new Movie(21,"Parasite", MovieStyles.THRILLER,2019,"https://image.tmdb.org/t/p/w500/7IiTTgloJzvGI1TAYymCfbfl3vT.jpg"),
//            new Movie(22,"Joker", MovieStyles.DRAME,2019,"https://image.tmdb.org/t/p/w500/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg"),
//            new Movie(23,"Avengers: Endgame", MovieStyles.ACTION,2019,"https://image.tmdb.org/t/p/w500/or06FN3Dka5tukK1e9sl16pB3iy.jpg"),
//            new Movie(24,"Iron Man", MovieStyles.ACTION,2008,"https://image.tmdb.org/t/p/w500/78lPtwv72eTNqFW9COBYI0dWDJa.jpg"),
//            new Movie(25,"Doctor Strange", MovieStyles.SF,2016,"https://image.tmdb.org/t/p/w500/4PiiNGXj1KENTmCBHeN6Mskj2Fq.jpg"),
//            new Movie(26,"Black Panther", MovieStyles.ACTION,2018,"https://image.tmdb.org/t/p/w500/uxzzxijgPIY7slzFvMotPv8wjKA.jpg"),
//            new Movie(27,"The Wolf of Wall Street", MovieStyles.COMEDIE,2013,"https://image.tmdb.org/t/p/w500/pWHf4E2fOelpq0sxod9Q7IuZQG7.jpg"),
//            new Movie(28,"The Revenant", MovieStyles.ACTION,2015,"https://image.tmdb.org/t/p/w500/oXUWEc5i3wYyFnL1Ycu8ppxxPvs.jpg"),
//            new Movie(29,"Django Unchained", MovieStyles.ACTION,2012,"https://image.tmdb.org/t/p/w500/7oWY8VDWW7thTzWh3OKYRkWUlD5.jpg"),
//            new Movie(30,"The Hateful Eight", MovieStyles.THRILLER,2015,"https://image.tmdb.org/t/p/w500/fqe8JxDNO8B8QfOGTdjhPK4F2ak.jpg"),
//            new Movie(31,"Blade Runner 2049", MovieStyles.SF,2017,"https://image.tmdb.org/t/p/w500/gajva2L0rPYkEWjzgFlBXCAVBE5.jpg"),
//            new Movie(32,"Arrival", MovieStyles.SF,2016,"https://image.tmdb.org/t/p/w500/x2FJsf1ElAgr63Y3PNPtJcuk9qC.jpg"),
//            new Movie(33,"Mad Max: Fury Road", MovieStyles.ACTION,2015,"https://image.tmdb.org/t/p/w500/8tZYtuWezp8JbcsvHYO0O46tFbo.jpg"),
//            new Movie(34,"The Social Network", MovieStyles.DRAME,2010,"https://image.tmdb.org/t/p/w500/n0ybibhJtQ5icDqTp8eRytcIHJx.jpg"),
//            new Movie(35,"The Grand Budapest Hotel", MovieStyles.COMEDIE,2014,"https://image.tmdb.org/t/p/w500/nX5XotM9yprCKarRH4fzOq1VM1")
//        };
}
