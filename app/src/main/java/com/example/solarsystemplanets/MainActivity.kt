package com.example.solarsystemplanets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.cardview.widget.CardView
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_planet_details.*

class MainActivity : AppCompatActivity() {


    private lateinit var myModelList: ArrayList<MyModel>
    private lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






        loadCards()







    }



    private fun loadCards() {
        myModelList = ArrayList()

        myModelList.add(
            MyModel(
                "SUN",
                "The Sun is the star at the center of the Solar System. It is a nearly perfect sphere of hot plasma,[18][19] heated to incandescence by nuclear fusion reactions in its core, radiating the energy mainly as light and infrared radiation. It is by far the most important source of energy for life on Earth. Its diameter is about 1.39 million kilometres (864,000 miles), or 109 times that of Earth, and its mass is about 330,000 times that of Earth. It accounts for about 99.86% of the total mass of the Solar System.[20] Roughly three quarters of the Sun's mass consists of hydrogen (~73%); the rest is mostly helium (~25%), with much smaller quantities of heavier elements, including oxygen, carbon, neon, and iron.[21]\n" +
                        "\n" +
                        "The Sun is a G-type main-sequence star (G2V) based on its spectral class. As such, it is informally and not completely accurately referred to as a yellow dwarf (its light is closer to white than yellow). It formed approximately 4.6 billion[a][14][22] years ago from the gravitational collapse of matter within a region of a large molecular cloud. Most of this matter gathered in the center, whereas the rest flattened into an orbiting disk that became the Solar System. The central mass became so hot and dense that it eventually initiated nuclear fusion in its core. It is thought that almost all stars form by this process.\n" +
                        "\n" +
                        "In its core the Sun currently fuses about 600 million tons of hydrogen into helium every second, converting 4 million tons of matter into energy every second as a result. This energy, which can take between 10,000 and 170,000 years to escape the core, is the source of the Sun's light and heat. When hydrogen fusion in its core has diminished to the point at which the Sun is no longer in hydrostatic equilibrium, its core will undergo a marked increase in density and temperature while its outer layers expand, eventually transforming the Sun into a red giant. It is calculated that the Sun will become sufficiently large to engulf the current orbits of Mercury and Venus, and render Earth uninhabitable – but not for about five billion years. After this, it will shed its outer layers and become a dense type of cooling star known as a white dwarf, and no longer produce energy by fusion, but still glow and give off heat from its previous fusion.\n" +
                        "\n" +
                        "The enormous effect of the Sun on Earth has been recognized since prehistoric times. The Sun has been regarded by some cultures as a deity. The synodic rotation of Earth and its orbit around the Sun are the basis of solar calendars, one of which is the predominant calendar in use today.",
                R.drawable.sun
            )
        )

        myModelList.add(
            MyModel(
                "MERCURY",
                "Mercury is the smallest and innermost planet in the Solar System. Its orbit around the Sun takes 87.97 Earth days, the shortest of all the planets in the Solar System. It is named after the Greek god Hermes (Ερμής), translated into Latin Mercurius Mercury, god of commerce, messenger of the gods, mediator between gods and mortals.\n" +
                        "\n" +
                        "Like Venus, Mercury orbits the Sun within Earth's orbit as an inferior planet, and its apparent distance from the Sun as viewed from Earth never exceeds 28°. This proximity to the Sun means the planet can only be seen near the western horizon after sunset or eastern horizon before sunrise, usually in twilight. At this time, it may appear as a bright star-like object, but is often far more difficult to observe than Venus. The planet telescopically displays the complete range of phases, similar to Venus and the Moon, as it moves in its inner orbit relative to Earth, which recurs over its synodic period of approximately 116 days.\n" +
                        "\n" +
                        "Mercury rotates in a way that is unique in the Solar System. It is tidally locked with the Sun in a 3:2 spin–orbit resonance,[16] meaning that relative to the fixed stars, it rotates on its axis exactly three times for every two revolutions it makes around the Sun.[a][17] As seen from the Sun, in a frame of reference that rotates with the orbital motion, it appears to rotate only once every two Mercurian years. An observer on Mercury would therefore see only one day every two Mercurian years.\n" +
                        "\n" +
                        "Mercury's axis has the smallest tilt of any of the Solar System's planets (about \u200B1⁄30 degree). Its orbital eccentricity is the largest of all known planets in the Solar System;[b] at perihelion, Mercury's distance from the Sun is only about two-thirds (or 66%) of its distance at aphelion. Mercury's surface appears heavily cratered and is similar in appearance to the Moon's, indicating that it has been geologically inactive for billions of years. Having almost no atmosphere to retain heat, it has surface temperatures that vary diurnally more than on any other planet in the Solar System, ranging from 100 K (−173 °C; −280 °F) at night to 700 K (427 °C; 800 °F) during the day across the equatorial regions.[18] The polar regions are constantly below 180 K (−93 °C; −136 °F). The planet has no known natural satellites.\n" +
                        "\n" +
                        "Two spacecraft have visited Mercury: Mariner 10 flew by in 1974 and 1975; and MESSENGER, launched in 2004, orbited Mercury over 4,000 times in four years before exhausting its fuel and crashing into the planet's surface on April 30, 2015.[19][20][21] The BepiColombo spacecraft is planned to arrive at Mercury in 2025.",
                R.drawable.mercury
            )
        )

        myModelList.add(
            MyModel(
                "VENUS",
                "Venus is the second planet from the Sun. It is named after the Roman goddess of love and beauty. As the second-brightest natural object in Earth's night sky after the Moon, Venus can cast shadows and can be, on rare occasion, visible to the naked eye in broad daylight.[15][16] Venus lies within Earth's orbit, and so never appears to venture far from the Sun, either setting in the west just after dusk or rising in the east a bit before dawn. Venus orbits the Sun every 224.7 Earth days.[17] With a rotation period of 243 Earth days, it takes longer to rotate about its axis than any other planet in the Solar System by far, and does so in the opposite direction to all but Uranus (meaning the Sun rises in the west and sets in the east).[18] Venus does not have any moons, a distinction it shares only with Mercury among the planets in the Solar System.[19]\n" +
                        "\n" +
                        "Venus is a terrestrial planet and is sometimes called Earth's \"sister planet\" because of their similar size, mass, proximity to the Sun, and bulk composition. It is radically different from Earth in other respects. It has the densest atmosphere of the four terrestrial planets, consisting of more than 96% carbon dioxide. The atmospheric pressure at the planet's surface is about 92 times the sea level pressure of Earth, or roughly the pressure at 900 m (3,000 ft) underwater on Earth. Venus has, by far, the hottest surface of any planet in the Solar System, with a mean temperature of 737 K (464 °C; 867 °F), even though Mercury is closer to the Sun. Venus is shrouded by an opaque layer of highly reflective clouds of sulfuric acid, preventing its surface from being seen from space in visible light. It may have had water oceans in the past,[20][21] but these would have vaporized as the temperature rose due to a runaway greenhouse effect.[22] The water has probably photodissociated, and the free hydrogen has been swept into interplanetary space by the solar wind because of the lack of a planetary magnetic field.[23] Venus' surface is a dry desertscape interspersed with slab-like rocks and is periodically resurfaced by volcanism.\n" +
                        "\n" +
                        "As one of the brightest objects in the sky, Venus has been a major fixture in human culture for as long as records have existed. It has been made sacred to gods of many cultures, and has been a prime inspiration for writers and poets as the \"morning star\" and \"evening star\". Venus was the first planet to have its motions plotted across the sky, as early as the second millennium BC.[24]\n" +
                        "\n" +
                        "Due to its proximity to Earth, Venus has been a prime target for early interplanetary exploration. It was the first planet beyond Earth visited by a spacecraft (Mariner 2 in 1962), and the first to be successfully landed on (by Venera 7 in 1970). Venus' thick clouds render observation of its surface impossible in visible light, and the first detailed maps did not emerge until the arrival of the Magellan orbiter in 1991. Plans have been proposed for rovers or more complex missions, but they are hindered by Venus' hostile surface conditions.\n" +
                        "\n" +
                        "The possibility of life on Venus has long been a topic of speculation, and in recent years has received active research. Following a 2019 observation that the light absorbance of the upper cloud layers was consistent with the presence of microorganisms, a September 2020 article in Nature Astronomy announced the detection of phosphine gas, a biomarker, in concentrations higher than can be explained by any known abiotic source.[25][26][27] However, doubts have been cast on these observations due to data-processing issues and the failure to detect phosphine at other wavelengths.",
                R.drawable.venus
            )
        )

        myModelList.add(
            MyModel(
                "MOON",
                "The Moon is a gravity rounded astronomical body of planetary-mass, rocky silicate composition and without significant atmosphere, hydrosphere or magnetic field. It is orbiting the planet Earth of the inner Solar System, as Earth's only natural satellite. Its surface gravity is about a sixth of Earth's with 0.1654 g. At an average orbital distance to Earth 384,402 km (238,856 mi),[13][14] or 1.28 light-seconds (about thirty times the diameter of Earth) its gravitational influence produces the main part of any type of Earth's tides, possibly Earth's magnetic field[15] and the slight lengthening of Earth's day.\n" +
                        "\n" +
                        "The Moon is in tidal locked synchronous rotation with Earth, rotating on its axis as fast as it orbits the Earth, thus always showing the same side to Earth, the near side, though slightly more than half (about 59%) of the total lunar surface can be viewed from Earth because of libration.[16] A full lunar day, the synodic period, takes two days longer as its orbit and has the same length as the completion of the lunar phases observed from Earth, the lunar month of a lunar calender. The near side is marked by dark volcanic maria that fill the spaces between the bright ancient crustal highlands and the prominent impact craters. Its surface is actually quite dark, with a reflectance just slightly higher than that of worn asphalt, but it still appears as the second-brightest celestial object regularly visible in Earth's sky after the Sun since it reflects mainly direct sunlight, is contrasted by the relatively dark sky and has a large apparent size viewed from Earth. The apparent size in Earth's sky is almost the same as that of the Sun, since the star is about 400 times the lunar distance and diameter. Therefore, the Moon covers the Sun nearly precisely during a total solar eclipse. This matching of apparent visual size will not continue in the far future because the Moon's distance from Earth is gradually increasing.\n" +
                        "\n" +
                        "The mean diameter of the Moon is 3474.8 km, about one fourth of Earth's and compareable to the width of Australia.[17] With this size it is the fifth-largest satellite in the Solar System, larger than any dwarf planet, and by far[18] the largest among planetary satellites relative to the size of the planet that it orbits.[f] The Moon is, after Jupiter's satellite Io, the second-densest satellite in the Solar System among those whose densities are known.\n" +
                        "\n" +
                        "The Moon is thought to have formed about 4.51 billion years ago, not long after Earth. The most widely accepted explanation is that the Moon formed from the debris left over after a giant impact between Earth and a hypothetical Mars-sized body called Theia. New research of Moon rocks, although not rejecting the Theia hypothesis, suggests that the Moon may be older than previously thought.[19]\n" +
                        "\n" +
                        "The Moon was first reached by a human-made object in September 1959, when the Soviet Union's Luna 2, an uncrewed spacecraft, was intentionally crashed onto the lunar surface. This accomplishment was followed by the first successful soft landing on the Moon by Luna 9 in 1966. The United States' NASA Apollo program achieved the only human lunar missions to date, beginning with the first human orbital mission by Apollo 8 in 1968, and six human landings between 1969 and 1972, with the first being Apollo 11 in July 1969. These missions returned lunar rocks which have been used to develop a geological understanding of the Moon's origin, internal structure, and the Moon's later history. Since the 1972 Apollo 17 mission, the Moon has been visited only by un-crewed spacecraft.\n" +
                        "\n" +
                        "Both the Moon's natural prominence in the earthly sky and its regular cycle of phases as seen from Earth have provided cultural references and influences for human societies and cultures since time immemorial. Such cultural influences can be found in language, lunar calendar systems, art, and mythology.",
                R.drawable.moon
            )
        )

        myModelList.add(
            MyModel(
                "EARTH",
                "Earth is the third planet from the Sun and the only astronomical object known to harbor life. About 29% of Earth's surface is land consisting of continents and islands. The remaining 71% is covered with water, mostly by oceans but also lakes, rivers and other fresh water, which together constitute the hydrosphere. Much of Earth's polar regions are covered in ice. Earth's outer layer is divided into several rigid tectonic plates that migrate across the surface over many millions of years. Earth's interior remains active with a solid iron inner core, a liquid outer core that generates Earth's magnetic field, and a convecting mantle that drives plate tectonics.\n" +
                        "\n" +
                        "According to radiometric dating estimation and other evidence, Earth formed over 4.5 billion years ago. Within the first billion years of Earth's history, life appeared in the oceans and began to affect Earth's atmosphere and surface, leading to the proliferation of anaerobic and, later, aerobic organisms. Some geological evidence indicates that life may have arisen as early as 4.1 billion years ago. Since then, the combination of Earth's distance from the Sun, physical properties and geological history have allowed life to evolve and thrive. In the history of life on Earth, biodiversity has gone through long periods of expansion, occasionally punctuated by mass extinctions. Over 99% of all species that ever lived on Earth are extinct. Almost 8 billion humans live on Earth and depend on its biosphere and natural resources for their survival. Humans increasingly impact Earth's hydrology, atmospheric processes and other life.\n" +
                        "\n" +
                        "Earth's atmosphere consists mostly of nitrogen and oxygen. Tropical regions receive more energy from the Sun than polar regions, which is redistributed by atmospheric and ocean circulation. Greenhouse gases also play an important role in regulating the surface temperature. A region's climate is not only determined by latitude, but also by its proximity to moderating oceans and height among other factors. Extreme weather, such as tropical cyclones and heat waves, occurs in most areas and has a large impact on life.\n" +
                        "\n" +
                        "Earth's gravity interacts with other objects in space, especially the Sun and the Moon, which is Earth's only natural satellite. Earth orbits around the Sun in about 365.25 days. Earth's axis of rotation is tilted with respect to its orbital plane, producing seasons on Earth. The gravitational interaction between Earth and the Moon causes tides, stabilizes Earth's orientation on its axis, and gradually slows its rotation. Earth is the densest planet in the Solar System and the largest and most massive of the four rocky planets.",
                R.drawable.earth
            )
        )



        myModelList.add(
            MyModel(
                "MARS",
                "Mars is the fourth planet from the Sun and the second-smallest planet in the Solar System, being larger than only Mercury. In English, Mars carries the name of the Roman god of war and is often referred to as the \"Red Planet\".[17][18] The latter refers to the effect of the iron oxide prevalent on Mars's surface, which gives it a reddish appearance distinctive among the astronomical bodies visible to the naked eye.[19] Mars is a terrestrial planet with a thin atmosphere, with surface features reminiscent of the impact craters of the Moon and the valleys, deserts and polar ice caps of Earth.\n" +
                        "\n" +
                        "The days and seasons are comparable to those of Earth, because the rotational period as well as the tilt of the rotational axis relative to the ecliptic plane are similar. Mars is the site of Olympus Mons, the largest volcano and highest known mountain on any planet in the Solar System, and of Valles Marineris, one of the largest canyons in the Solar System. The smooth Borealis basin in the northern hemisphere covers 40% of the planet and may be a giant impact feature.[20][21] Mars has two moons, Phobos and Deimos, which are small and irregularly shaped. These may be captured asteroids, similar to 5261 Eureka, a Mars trojan.[22][23]\n" +
                        "\n" +
                        "Mars has been explored by several uncrewed spacecraft. Mariner 4 was the first spacecraft to visit Mars; launched by NASA on 28 November 1964, it made its closest approach to the planet on 15 July 1965. Mariner 4 detected the weak Martian radiation belt, measured at about 0.1% that of Earth, and captured the first images of another planet from deep space.[24] The Soviet Mars 3 mission included a lander, which achieved a soft landing in December 1971; however, contact was lost seconds after touchdown.[25] On 20 July 1976, Viking 1 performed the first successful landing on the Martian surface.[26] On 4 July 1997, the Mars Pathfinder spacecraft landed on Mars and on 5 July released its rover, Sojourner, the first robotic rover to operate on Mars.[27] The Mars Express orbiter, the first European Space Agency (ESA) spacecraft to visit Mars, arrived in orbit on 25 December 2003.[28] In January 2004, the Mars Exploration Rovers, named Spirit and Opportunity, both landed on Mars. Spirit operated until 22 March 2010 and Opportunity lasted until 10 June 2018.[29] On 24 September 2014, the Indian Space Research Organisation (ISRO) became the fourth space agency to visit Mars when its maiden interplanetary mission, the Mars Orbiter Mission spacecraft, arrived in orbit.[30]\n" +
                        "\n" +
                        "There are investigations assessing the past habitability of Mars, as well as the possibility of extant life. Astrobiology missions are planned, including the Perseverance and Rosalind Franklin rovers.[31][32][33][34] Liquid water on the surface of Mars cannot exist due to low atmospheric pressure, which is less than 1% of the atmospheric pressure on Earth, except at the lowest elevations for short periods.[35][36][37] The two polar ice caps appear to be made largely of water.[38][39] The volume of water ice in the south polar ice cap, if melted, would be sufficient to cover the planetary surface to a depth of 11 metres (36 ft).[40] In November 2016, NASA reported finding a large amount of underground ice in the Utopia Planitia region. The volume of water detected has been estimated to be equivalent to the volume of water in Lake Superior.[41][42][43]\n" +
                        "\n" +
                        "Mars can easily be seen from Earth with the naked eye, as can its reddish coloring. Its apparent magnitude reaches −2.94, which is surpassed only by Venus, the Moon and the Sun.[13] Optical ground-based telescopes are typically limited to resolving features about 300 kilometres (190 mi) across when Earth and Mars are closest because of Earth's atmosphere.",
                R.drawable.mars
            )
        )

        myModelList.add(
            MyModel(
                "JUPITER",
                "Jupiter is the fifth planet from the Sun and the largest in the Solar System. It is a gas giant with a mass one-thousandth that of the Sun, but two-and-a-half times that of all the other planets in the Solar System combined. Jupiter is one of the brightest objects visible to the naked eye in the night sky, and has been known to ancient civilizations since before recorded history. It is named after the Roman god Jupiter.[19] When viewed from Earth, Jupiter can be bright enough for its reflected light to cast visible shadows,[20] and is on average the third-brightest natural object in the night sky after the Moon and Venus.\n" +
                        "\n" +
                        "Jupiter is primarily composed of hydrogen with a quarter of its mass being helium, though helium comprises only about a tenth of the number of molecules. It may also have a rocky core of heavier elements,[21] but like the other giant planets, Jupiter lacks a well-defined solid surface. Because of its rapid rotation, the planet's shape is that of an oblate spheroid (it has a slight but noticeable bulge around the equator). The outer atmosphere is visibly segregated into several bands at different latitudes, resulting in turbulence and storms along their interacting boundaries. A prominent result is the Great Red Spot, a giant storm that is known to have existed since at least the 17th century when it was first seen by telescope. Surrounding Jupiter is a faint planetary ring system and a powerful magnetosphere. Jupiter has 79 known moons,[22] including the four large Galilean moons discovered by Galileo Galilei in 1610. Ganymede, the largest of these, has a diameter greater than that of the planet Mercury.\n" +
                        "\n" +
                        "Pioneer 10 was the first spacecraft to visit Jupiter, making its closest approach to the planet on December 4, 1973; Pioneer 10 identified plasma in Jupiter's magnetic field and also found that Jupiter's magnetic tail was nearly 800 million kilometers long, covering the entire distance to Saturn.[23] Jupiter has been explored on a number of occasions by robotic spacecraft, beginning with the Pioneer and Voyager flyby missions from 1973 to 1979, and later by the Galileo orbiter, which arrived at Jupiter in 1995.[24] In late February 2007, Jupiter was visited by the New Horizons probe, which used Jupiter's gravity to increase its speed and bend its trajectory en route to Pluto. The latest probe to visit the planet is Juno, which entered into orbit around Jupiter on July 4, 2016.[25][26] Future targets for exploration in the Jupiter system include the probable ice-covered liquid ocean of its moon Europa.",
                R.drawable.jupiter
            )
        )

        myModelList.add(
            MyModel(
                "SATURN",
                "Saturn is the sixth planet from the Sun and the second-largest in the Solar System, after Jupiter. It is a gas giant with an average radius of about nine times that of Earth.[20][21] It only has one-eighth the average density of Earth; however, with its larger volume, Saturn is over 95 times more massive.[22][23][24] Saturn is named after the Roman god of wealth and agriculture; its astronomical symbol (♄) represents the god's sickle.\n" +
                        "\n" +
                        "Saturn's interior is most likely composed of a core of iron–nickel and rock (silicon and oxygen compounds). Its core is surrounded by a deep layer of metallic hydrogen, an intermediate layer of liquid hydrogen and liquid helium, and finally a gaseous outer layer. Saturn has a pale yellow hue due to ammonia crystals in its upper atmosphere. An electrical current within the metallic hydrogen layer is thought to give rise to Saturn's planetary magnetic field, which is weaker than the Earth's, but has a magnetic moment 580 times that of Earth due to Saturn's larger size. Saturn's magnetic field strength is around one-twentieth of Jupiter's.[25] The outer atmosphere is generally bland and lacking in contrast, although long-lived features can appear. Wind speeds on Saturn can reach 1,800 km/h (1,100 mph; 500 m/s), higher than on Jupiter, but not as high as those on Neptune.[26] In January 2019, astronomers reported that a day on the planet Saturn has been determined to be10h 33m 38s + 1m 52s\n" +
                        "− 1m 19s , based on studies of the planet's C Ring.[14][15]\n" +
                        "\n" +
                        "The planet's most famous feature is its prominent ring system, which is composed mostly of ice particles, with a smaller amount of rocky debris and dust. At least 82 moons[27] are known to orbit Saturn, of which 53 are officially named; this does not include the hundreds of moonlets in its rings. Titan, Saturn's largest moon, and the second-largest in the Solar System, is larger than the planet Mercury, although less massive, and is the only moon in the Solar System to have a substantial atmosphere.[28]",
                R.drawable.saturn
            )
        )

        myModelList.add(
            MyModel(
                "URANUS",
                "Uranus is the seventh planet from the Sun. Its name is a reference to the Greek god of the sky, Uranus, who, according to Greek mythology, was the grandfather of Zeus (Jupiter) and father of Cronus (Saturn). It has the third-largest planetary radius and fourth-largest planetary mass in the Solar System. Uranus is similar in composition to Neptune, and both have bulk chemical compositions which differ from that of the larger gas giants Jupiter and Saturn. For this reason, scientists often classify Uranus and Neptune as \"ice giants\" to distinguish them from the other gas giants. Uranus's atmosphere is similar to Jupiter's and Saturn's in its primary composition of hydrogen and helium, but it contains more \"ices\" such as water, ammonia, and methane, along with traces of other hydrocarbons.[16] It has the coldest planetary atmosphere in the Solar System, with a minimum temperature of 49 K (−224 °C; −371 °F), and has a complex, layered cloud structure with water thought to make up the lowest clouds and methane the uppermost layer of clouds.[16] The interior of Uranus is mainly composed of ices and rock.[15]\n" +
                        "\n" +
                        "Like the other giant planets, Uranus has a ring system, a magnetosphere, and numerous moons. The Uranian system has a unique configuration because its axis of rotation is tilted sideways, nearly into the plane of its solar orbit. Its north and south poles, therefore, lie where most other planets have their equators.[21] In 1986, images from Voyager 2 showed Uranus as an almost featureless planet in visible light, without the cloud bands or storms associated with the other giant planets.[21] Voyager 2 remains the only spacecraft to visit the planet.[22] Observations from Earth have shown seasonal change and increased weather activity as Uranus approached its equinox in 2007. Wind speeds can reach 250 metres per second (900 km/h; 560 mph).[23]",
                R.drawable.uranus
            )
        )



        myModelList.add(
            MyModel(
                "NEPTUNE",
                "Neptune is the eighth and farthest-known Solar planet from the Sun. In the Solar System, it is the fourth-largest planet by diameter, the third-most-massive planet, and the densest giant planet. It is 17 times the mass of Earth, slightly more massive than its near-twin Uranus. Neptune is denser and physically smaller than Uranus because its greater mass causes more gravitational compression of its atmosphere. The planet orbits the Sun once every 164.8 years at an average distance of 30.1 AU (4.5 billion km; 2.8 billion mi). It is named after the Roman god of the sea and has the astronomical symbol ♆, a stylised version of the god Neptune's trident.\n" +
                        "\n" +
                        "Neptune is not visible to the unaided eye and is the only planet in the Solar System found by mathematical prediction rather than by empirical observation. Unexpected changes in the orbit of Uranus led Alexis Bouvard to deduce that its orbit was subject to gravitational perturbation by an unknown planet. After Bouvard's death, the position of Neptune was predicted from his observations, independently, by John Couch Adams and Urbain Le Verrier. Neptune was subsequently observed with a telescope on 23 September 1846[1] by Johann Galle within a degree of the position predicted by Le Verrier. Its largest moon, Triton, was discovered shortly thereafter, though none of the planet's remaining 13 known moons were located telescopically until the 20th century. The planet's distance from Earth gives it a very small apparent size, making it challenging to study with Earth-based telescopes. Neptune was visited by Voyager 2, when it flew by the planet on 25 August 1989; Voyager 2 remains the only spacecraft to visit Neptune.[17][18] The advent of the Hubble Space Telescope and large ground-based telescopes with adaptive optics has recently allowed for additional detailed observations from afar.\n" +
                        "\n" +
                        "Like Jupiter and Saturn, Neptune's atmosphere is composed primarily of hydrogen and helium, along with traces of hydrocarbons and possibly nitrogen, though it contains a higher proportion of \"ices\" such as water, ammonia and methane. However, similar to Uranus, its interior is primarily composed of ices and rock;[19] Uranus and Neptune are normally considered \"ice giants\" to emphasise this distinction.[20] Traces of methane in the outermost regions in part account for the planet's blue appearance.[21]\n" +
                        "\n" +
                        "In contrast to the hazy, relatively featureless atmosphere of Uranus, Neptune's atmosphere has active and visible weather patterns. For example, at the time of the Voyager 2 flyby in 1989, the planet's southern hemisphere had a Great Dark Spot comparable to the Great Red Spot on Jupiter. These weather patterns are driven by the strongest sustained winds of any planet in the Solar System, with recorded wind speeds as high as 2,100 km/h (580 m/s; 1,300 mph).[22] Because of its great distance from the Sun, Neptune's outer atmosphere is one of the coldest places in the Solar System, with temperatures at its cloud tops approaching 55 K (−218 °C; −361 °F). Temperatures at the planet's centre are approximately 5,400 K (5,100 °C; 9,300 °F).[23][24] Neptune has a faint and fragmented ring system (labelled \"arcs\"), which was discovered in 1984, then later confirmed by Voyager 2.[25]",
                R.drawable.neptune
            )
        )



        myModelList.add(
            MyModel(
                "PLUTO",
                "Pluto (minor planet designation: 134340 Pluto) is a dwarf planet in the Kuiper belt, a ring of bodies beyond the orbit of Neptune. It was the first and the largest Kuiper belt object to be discovered. After Pluto was discovered in 1930 it was declared to be the ninth planet from the Sun. Beginning in the 1990s, its status as a planet was questioned following the discovery of several objects of similar size in the Kuiper belt, including the dwarf planet Eris. This led the International Astronomical Union (IAU) in 2006 to formally define the term \"planet\" — excluding Pluto and reclassifying it as a dwarf planet.\n" +
                        "\n" +
                        "Pluto is the ninth-largest and tenth-most-massive known object directly orbiting the Sun. It is the largest known trans-Neptunian object by volume but is less massive than Eris. Like other Kuiper belt objects, Pluto is primarily made of ice and rock and is relatively small—one-sixth the mass of the Moon and one-third its volume. It has a moderately eccentric and inclined orbit during which it ranges from 30 to 49 astronomical units or AU (4.4–7.4 billion km) from the Sun. This means that Pluto periodically comes closer to the Sun than Neptune, but a stable orbital resonance with Neptune prevents them from colliding. Light from the Sun takes 5.5 hours to reach Pluto at its average distance (39.5 AU).\n" +
                        "\n" +
                        "Pluto has five known moons: Charon (the largest, with a diameter just over half that of Pluto), Styx, Nix, Kerberos, and Hydra. Pluto and Charon are sometimes considered a binary system because the barycenter of their orbits does not lie within either body.\n" +
                        "\n" +
                        "The New Horizons spacecraft performed a flyby of Pluto on July 14, 2015, becoming the first and, to date, only spacecraft to do so. During its brief flyby, New Horizons made detailed measurements and observations of Pluto and its moons. In September 2016, astronomers announced that the reddish-brown cap of the north pole of Charon is composed of tholins, organic macromolecules that may be ingredients for the emergence of life, and produced from methane, nitrogen and other gases released from the atmosphere of Pluto and transferred 19,000 km (12,000 mi) to the orbiting moon.",
                R.drawable.pluto
            )
        )







        myAdapter = MyAdapter(this,myModelList)

        viewPager.adapter = myAdapter
        viewPager.setPadding(100,0,100,0)


    }



}