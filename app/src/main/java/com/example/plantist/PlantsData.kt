package com.example.myrecyclerview

import com.example.plantist.Plants
import com.example.plantist.R

object PlantsData {
    private val plantsNames = arrayOf(
        "Aglonema",
        "Alocasia",
        "Begonia",
        "Cactus",
        "Caladium",
        "Calathea",
        "Coleus",
        "Colocasia",
        "Epipremnum",
        "Hypoestes",
        "Monstera",
        "Peperomia",
        "Sansivera",
        "Succulent",
        "Syngonium",
        "Zamioculcas"

    )

    private val plantsDetails = arrayOf(
            "Aglonema is a genus of flowering plants in the arum family, Araceae. They are native to tropical and subtropical regions of Asia and New Guinea. They are known commonly as Chinese evergreens.",
            "Alocasia is a genus of broad-leaved, rhizomatous, or tuberous perennial flowering plants from the family Araceae. There are 97 accepted species native to tropical and subtropical Asia and Eastern Australia. Around the world, many growers widely cultivate a range of hybrids and cultivars.",
            "Begonia is a genus of perennial flowering plants in the family Begoniaceae. The genus contains more than 2,000 different plant species. The Begonias are native to moist subtropical and tropical climates. Some species are commonly grown indoors as ornamental houseplants in cooler climates. In cooler climates some species are cultivated outside in summertime for their bright colorful flowers, which have sepals but no petals.",
            "Cactus is a plant where the leaves have been reduced to needles in order to save on the amount of water the plant needs.",
            "Caladium is a genus of flowering plants in the family Araceae. They are often known by the common name elephant ear (which they share with the closely related genera Alocasia, Colocasia, and Xanthosoma), heart of Jesus, and angel wings.",
            "Calathea is a genus of flowering plant belonging to the family Marantaceae. They are commonly called calatheas or (like their relatives) prayer plants.",
            "Coleus is a species of flowering plant in the family Lamiaceae (the mint or deadnettle family), native to southeast Asia through to Australia. Another common name is painted nettle,[3] reflecting its relationship to deadnettles (Lamium species), which are in the same family.",
            "Colocasia is a genus of flowering plants in the family Araceae, native to southeastern Asia and the Indian subcontinent. Some species are widely cultivated and naturalized in other tropical and subtropical regions.",
            "Epipremnum is a genus of flowering plants in the family Araceae, found in tropical forests from China, the Himalayas, and Southeast Asia to Australia the western Pacific. They are evergreen perennial vines climbing with the aid of aerial roots.",
            "Hypoestes is a flowering plant genus of about 150 species. They are widely distributed throughout the tropical and subtropical lands around the Indian Ocean, and some adjacent regions.",
            "Monstera is a genus of 45 species of flowering plants in the arum family, Araceae, native to tropical regions of the Americas. The genus is named from the Latin word for 'monstrous' or 'abnormal', and refers to the unusual leaves with natural holes that members of the genus have.",
            "Peperomia is one of the two large genera of the family Piperaceae. Most of them are compact, small perennial epiphytes growing on rotten wood.",
            "Sansevieria is a historically recognized genus of flowering plants, native to Africa, notably Madagascar, and southern Asia, now included in the genus Dracaena on the basis of molecular phylogenetic studies.",
            "Succulents are plants with parts that are thickened, fleshy, and engorged, usually to retain water in arid climates or soil conditions.",
            "Syngonium is a genus of flowering plants in the family Araceae, native to tropical rainforests in southern Mexico, the West Indies, Central and South America.",
            "Zamioculcas is a genus of flowering plants in the family Araceae, containing the single species Zamioculcas zamiifolia."
        )

    private val plantsImages = intArrayOf(
        R.drawable.aglonema,
        R.drawable.alocasia,
        R.drawable.begonia,
        R.drawable.cactus,
        R.drawable.caladium,
        R.drawable.calathea,
        R.drawable.coleus,
        R.drawable.colocasia,
        R.drawable.epipremnum,
        R.drawable.hypoestes,
        R.drawable.monstera,
        R.drawable.peperomia,
        R.drawable.sansivera,
        R.drawable.succulent,
        R.drawable.syngonium,
        R.drawable.zamioculcas
    )

    private val plantsDescriptions = arrayOf(
            "These are evergreen perennials with stems growing erect or decumbent and creeping. Stems that grow along the ground may root at the nodes. There is generally a crown of wide leaf blades which in wild species are often variegated with silver and green coloration. The inflorescence bears unisexual flowers in a spadix, with a short zone of female flowers near the base and a wider zone of male flowers nearer the tip. The fruit is a fleshy berry that ripens red. The fruit is a thin layer covering one large seed. Plants of the genus are native to humid, shady tropical forest habitat.",
            "The large, cordate, or sagittate leaves grow to a length of 20 to 90 cm on long petioles. Their araceous flowers grow at the end of a short stalk, but are not conspicuous; often hidden behind the leaf petioles. The corms of some species can be processed to make them edible, however, the raw plants contain raphid or raphide crystals of calcium oxalate along with other irritants (possibly including proteases) that can numb and swell the tongue and pharynx. This can cause difficulty breathing and sharp pain in the throat. Lower parts of the plant contain the highest concentrations of the poison. Prolonged boiling before serving or processing may reduce risk of adverse reactions. Additionally, acidic fruit such as tamarind may dissolve the raphides altogether. It's important to note, however, that this species varies in toxicity, and can still be dangerous to ingest, even after taking precautions.",
            "With 2,002 species, Begonia is one of the largest genera of flowering plants. The species are terrestrial (sometimes epiphytic) herbs or undershrubs, and occur in subtropical and tropical moist climates, in South and Central America, Africa, and southern Asia. Terrestrial species in the wild are commonly upright-stemmed, rhizomatous, or tuberous. The plants are monoecious, with unisexual male and female flowers occurring separately on the same plant; the male contains numerous stamens, and the female has a large inferior ovary and two to four branched or twisted stigmas. In most species, the fruit is a winged capsule containing numerous minute seeds, although baccate fruits are also known. The leaves, which are often large and variously marked or variegated, are usually asymmetric (unequal-sided).",
            "Cactus, (family Cactaceae), plural cacti or cactuses, flowering plant family (order Caryophyllales) with nearly 2,000 species and 139 genera. Cacti are native through most of the length of North and South America, from British Columbia and Alberta southward; the southernmost limit of their range extends far into Chile and Argentina. Mexico has the greatest number and variety of species. The only cacti possibly native to the Old World are members of the genus Rhipsalis, occurring in East Africa, Madagascar, and Sri Lanka. Although a few cactus species inhabit tropical or subtropical areas, most live in and are well adapted to dry regions. See also list of plants in the family Cactaceae.",
            "There are over 1000 named cultivars of Caladium bicolor from the original South American plant. The genus Caladium includes seven species that are native to South America and Central America, and naturalized in India, parts of Africa, and various tropical islands. They grow in open areas of the forest and on the banks of rivers and go dormant during the dry season. The wild plants grow to 15–35 inches (40–90 cm) tall, with leaves mostly 6-18 inches (15–45 cm) long and broad.",
            "About 200 species formerly assigned to Calathea are now in the genus Goeppertia. There are several dozen species in this genus. Native to the tropical Americas, many of the species are popular as pot plants due to their decorative leaves and, in some species, colorful inflorescences. The young leaves and bracts can retain pools of water, called phytotelmata, that provide habitat for many invertebrates.",
            "Coleus scutellarioides is an upright annual or short-lived perennial plant. It may be as much as 1 m (3 ft) tall, with well branched, more-or-less four-sided stems. Shorter, more trailing forms have sometimes been described as separate species, under names such as Coleus pumilus or Solenostemon pumilus, but are all now considered part of the very variable C. scutellarioides. The species is extremely variable in the colour and shape of the leaves. They are somewhat fleshy, varying in size from 1.5–10 cm (0.6–3.9 in) long by 1–6 cm (0.4–2.4 in) wide, generally ovate in shape, and borne on petioles (stalks) from 0.5–5 cm (0.2–2.0 in) long. The leaf margin is divided to a variable degree. Hairs are present on both sides of the leaf.",
            "They are herbaceous perennial plants with a large corm on or just below the ground surface. The leaves are large to very large, 20–150 cm (7.9–59.1 in) long, with a sagittate shape. The elephant's-ear plant gets its name from the leaves, which are shaped like a large ear or shield. The plant reproduces mostly by means of rhizomes (tubers, corms), but it also produces 'clusters of two to five fragrant inflorescences in the leaf axils'. Like other members of the family, the plant contains an irritant which causes intense discomfort to the lips, mouth and throat. This acridity is caused in part by microscopic needle-like raphides of calcium oxalate monohydrate. It must be processed by cooking, soaking or fermenting – sometimes along with an acid (lime or tamarind) – before being eaten.",
            "All parts of the plants are toxic, mostly due to trichosclereids (long sharp cells) and raphides. Plants can grow to over 40 m (131 ft) with leaves up to 3 m (10 ft) long, but in containers the size is much reduced. The plants, commonly known as centipede tongavine, pothos or devil's ivy, depending on species, are typically grown as houseplants in temperate regions. Juvenile leaves are bright green, often with irregularly variegated patterns of yellow or white. They may find host trees by the use of Skototropism.",
            "Hypoestes belongs to the subfamily Acanthoideae of the acanthus family Acanthaceae. Therein, it is classified in the subtribe Justiciinae of tribe Ruellieae, making it a relative of such American genera as the mosaic plants (Fittonia), water-willows (Justicia) and wrightworts (Carlowrightia). Hypoestes comes from the Greek 'hypo' meaning under, and 'estia' meaning house. It refers to the way the flowers are hidden by the fused bracts.",
            "They are herbs or evergreen vines, growing to heights of 20 metres (66 ft) in trees, climbing by means of aerial roots which act as hooks over branches; these roots will also grow into the soil to help support the plant. Since the plant roots both into the soil and over trees, it is considered a hemiepiphyte. The leaves are alternate, leathery, dark green, very large, from 25–90 centimetres (9.8–35.4 in) long (up to 130 centimetres (51 in) long in M. dubia) and 15–75 centimetres (5.9–29.5 in) broad, often with holes in the leaf blade. The fenestrated leaves allow for the leaves to spread over greater area to increase sunlight exposure, by using less energy to produce and maintain the leaves. The flowers are borne on a specialised inflorescence called a spadix, 5–45 centimetres (2.0–17.7 in) long; the fruit is a cluster of white berries, edible in some species.",
            "More than 1500 species have been recorded, occurring in all tropical and subtropical regions of the world, though concentrated in Central America and northern South America. A limited number of species (around 17) are found in Africa. These tropical perennials are grown for their ornamental foliage. They are mostly natives of tropical America. They are compact and usually do not exceed 12 inches (30 cm) in height. They vary considerably in appearance.",
            "Common names for the 70 or so species formerly placed in the genus include mother-in-law's tongue, devil's tongue, jinn's tongue, bow string hemp, snake plant and snake tongue. In the APG III classification system, Dracaena is placed in the family Asparagaceae, subfamily Nolinoideae (formerly the family Ruscaceae). It has also been placed in the former family Dracaenaceae. There is great variation within the species formerly placed in the genus; they range from succulent desert plants such as Dracaena pinguicula to thinner leafed tropical plants such as Dracaena trifasciata. Plants often form dense clumps from a spreading rhizome or stolons.",
            "While most types of succulents require warm temperatures, moderately dry, well-draining soil and sunlight, some can withstand cooler or even downright cold temperatures. These hardy succulents are able to withstand brief freezes and fend off frost damage. Occasionally, cold snaps will force a plant into dormancy, but well established hardy types will spring back when warm weather returns. It is important to know if your succulent is a tropical or hardy variety in instances where it is planted outdoors.",
            "They are woody vines growing to heights of 10–20 m or more in trees. They have leaves that change shape according to the plant's stage of growth, and adult leaf forms are often much more lobed than the juvenile forms usually seen on small house plants. Syngonium species are often grown as house plants, usually only in the juvenile foliage stages. Syngonium podophyllum is the most commonly cultivated species, and is often referred to simply as Syngonium.",
            "It is a herbaceous perennial growing to 45–60 centimetres (17.7–23.6 in) tall, from a stout underground, succulent rhizome. It is normally evergreen, but becomes deciduous during drought, surviving drought due to the large potato-like rhizome that stores water until rainfall resumes. The leaves are pinnate, 40–60 centimetres (15.7–23.6 in) long, with 6–8 pairs of leaflets 7–15 centimetres (2.8–5.9 in) long; they are smooth, shiny, and dark green. The stems of these pinnate leaves are thickened at the bottom."
        )

    private val plantsWaterInfo = arrayOf(
        "once a day",
        "twice a day",
        "once a day",
        "twice a day",
        "once a day",
        "twice a day",
        "once a day",
        "twice a day",
        "once a day",
        "twice a day",
        "once a day",
        "twice a day",
        "once a day",
        "twice a day",
        "once a day",
        "twice a day"
    )

    private val plantsIlluminationInfo = arrayOf(
        "room temperature",
        "room temperature",
        "room temperature",
        "room temperature",
        "room temperature",
        "room temperature",
        "room temperature",
        "room temperature",
        "room temperature",
        "room temperature",
        "room temperature",
        "room temperature",
        "room temperature",
        "room temperature",
        "room temperature",
        "room temperature"
    )

    private val plantsTemperatureInfo = arrayOf(
        "room",
        "room",
        "room",
        "room",
        "room",
        "room",
        "room",
        "room",
        "room",
        "room",
        "room",
        "room",
        "room",
        "room",
        "room",
        "room"
    )

    private val plantsFertilizerInfo = arrayOf(
        "1 every 4 weeks",
        "1 every 2 weeks",
        "1 every 3 weeks",
        "2 every 4 weeks",
        "1 every 4 weeks",
        "1 every 2 weeks",
        "1 every 3 weeks",
        "2 every 4 weeks",
        "1 every 4 weeks",
        "1 every 2 weeks",
        "1 every 3 weeks",
        "2 every 4 weeks",
        "1 every 4 weeks",
        "1 every 2 weeks",
        "1 every 3 weeks",
        "2 every 4 weeks"
    )

    private val plantsShareMessages = arrayOf(
        "Do you know Aglonema?\n\n" +
                "Aglonema is a genus of flowering plants in the arum family, Araceae. They are native to tropical and subtropical regions of Asia and New Guinea. They are known commonly as Chinese evergreens.\n" +
                "\n\nCheck it more on Plantist!\n" +
                "or download it on bit.ly/PlantistApk",
        "Do you know Alocasia?\n\n" +
                "Alocasia is a genus of broad-leaved, rhizomatous, or tuberous perennial flowering plants from the family Araceae. There are 97 accepted species native to tropical and subtropical Asia and Eastern Australia. Around the world, many growers widely cultivate a range of hybrids and cultivars."+
                "\n\n\nCheck it more on Plantist!\n" +
                "or download it on bit.ly/PlantistApk",
        "Do you know Begonia?\n\n" +
                "Begonia is a genus of perennial flowering plants in the family Begoniaceae. The genus contains more than 2,000 different plant species. The Begonias are native to moist subtropical and tropical climates. Some species are commonly grown indoors as ornamental houseplants in cooler climates. In cooler climates some species are cultivated outside in summertime for their bright colorful flowers, which have sepals but no petals."+
                "\n\n\nCheck it more on Plantist!\n" +
                "or download it on bit.ly/PlantistApk",
        "Do you know Cactus?\n\n" +
                "Cactus is a plant where the leaves have been reduced to needles in order to save on the amount of water the plant needs."+
                "\n\n\nCheck it more on Plantist!\n" +
                "or download it on bit.ly/PlantistApk",
        "Do you know Caladium?\n\n" +
                "Caladium is a genus of flowering plants in the family Araceae. They are often known by the common name elephant ear (which they share with the closely related genera Alocasia, Colocasia, and Xanthosoma), heart of Jesus, and angel wings."+
                "\n\n\nCheck it more on Plantist!\n" +
                "or download it on bit.ly/PlantistApk",
        "Do you know Calathea?\n\n" +
                "Calathea is a genus of flowering plant belonging to the family Marantaceae. They are commonly called calatheas or (like their relatives) prayer plants."+
                "\n\n\nCheck it more on Plantist!\n" +
                "or download it on bit.ly/PlantistApk",
        "Do you know Coleus?\n\n" +
                "Coleus is a species of flowering plant in the family Lamiaceae (the mint or deadnettle family), native to southeast Asia through to Australia. Another common name is painted nettle,[3] reflecting its relationship to deadnettles (Lamium species), which are in the same family."+
                "\n\n\nCheck it more on Plantist!\n" +
                "or download it on bit.ly/PlantistApk",
        "Do you know Colocasia?\n\n" +
                "Colocasia is a genus of flowering plants in the family Araceae, native to southeastern Asia and the Indian subcontinent. Some species are widely cultivated and naturalized in other tropical and subtropical regions."+
                "\n\n\nCheck it more on Plantist!\n" +
                "or download it on bit.ly/PlantistApk",
        "Do you know Epipremnum?\n\n" +
                "Epipremnum is a genus of flowering plants in the family Araceae, found in tropical forests from China, the Himalayas, and Southeast Asia to Australia the western Pacific. They are evergreen perennial vines climbing with the aid of aerial roots."+
                "\n\n\nCheck it more on Plantist!\n" +
                "or download it on bit.ly/PlantistApk",
        "Do you know Hypoestes?\n\n" +
                "Hypoestes is a flowering plant genus of about 150 species. They are widely distributed throughout the tropical and subtropical lands around the Indian Ocean, and some adjacent regions."+
                "\n\n\nCheck it more on Plantist!\n" +
                "or download it on bit.ly/PlantistApk",
        "Do you know Monstera?\n\n" +
                "Monstera is a genus of 45 species of flowering plants in the arum family, Araceae, native to tropical regions of the Americas. The genus is named from the Latin word for 'monstrous' or 'abnormal', and refers to the unusual leaves with natural holes that members of the genus have."+
                "\n\n\nCheck it more on Plantist!\n" +
                "or download it on bit.ly/PlantistApk",
        "Do you know Peperomia?\n\n" +
                "Peperomia is one of the two large genera of the family Piperaceae. Most of them are compact, small perennial epiphytes growing on rotten wood."+
                "\n\n\nCheck it more on Plantist!\n" +
                "or download it on bit.ly/PlantistApk",
        "Do you know Sansevieria?\n\n" +
                "Sansevieria is a historically recognized genus of flowering plants, native to Africa, notably Madagascar, and southern Asia, now included in the genus Dracaena on the basis of molecular phylogenetic studies."+
                "\n\n\nCheck it more on Plantist!\n" +
                "or download it on bit.ly/PlantistApk",
        "Do you know Succulents?\n\n" +
                "Succulents are plants with parts that are thickened, fleshy, and engorged, usually to retain water in arid climates or soil conditions."+
                "\n\n\nCheck it more on Plantist!\n" +
                "or download it on bit.ly/PlantistApk",
        "Do you know Syngonium?\n\n" +
                "Syngonium is a genus of flowering plants in the family Araceae, native to tropical rainforests in southern Mexico, the West Indies, Central and South America."+
                "\n\n\nCheck it more on Plantist!\n" +
                "or download it on bit.ly/PlantistApk",
        "Do you know Zamioculcas?\n\n" +
                "Zamioculcas is a genus of flowering plants in the family Araceae, containing the single species Zamioculcas zamiifolia."+
                "\n\n\nCheck it more on Plantist!\n" +
                "or download it on bit.ly/PlantistApk"
    )

    private val plantsPhotoFlag= arrayOf(
        "aglonema.png",
        "alocasia.png",
        "begonia.png",
        "cactus.png",
        "caladium.png",
        "calathea.png",
        "coleus.png",
        "colocasia.png",
        "epipremnum.png",
        "hypoestes.png",
        "monstera.png",
        "peperomia.png",
        "sansivera.png",
        "succulent.png",
        "syngonium.png",
        "zamioculcas.png"
    )

    val listData: ArrayList<Plants>
        get() {
            val list = arrayListOf<Plants>()
            for (position in plantsNames.indices) {
                val plants = Plants()
                plants.name = plantsNames[position]
                plants.photo = plantsImages[position]
                plants.detail = plantsDetails[position]
                plants.description = plantsDescriptions[position]
                plants.water = plantsWaterInfo[position]
                plants.illumination = plantsIlluminationInfo[position]
                plants.temperature = plantsTemperatureInfo[position]
                plants.fertilizer = plantsFertilizerInfo[position]
                plants.shareMessage = plantsShareMessages[position]
                plants.photoFlag = plantsPhotoFlag[position]
                list.add(plants)
            }
            return list
        }
}