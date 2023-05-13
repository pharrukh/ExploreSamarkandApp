package com.normuradov.exploresamarkand.data

import com.normuradov.exploresamarkand.R
import com.normuradov.exploresamarkand.model.Category
import com.normuradov.exploresamarkand.model.Sightseeing

object Repository {
    val categoryItems = listOf<Sightseeing>(
        Sightseeing(
            id = 0,
            name = "Afrosiab",
            oldImageId = R.drawable.afrosiab_old,
            newImageId = R.drawable.afrosiab_new,
            address = "Near the Siyab Bazaar",
            category = Category.Ancient,
            constructionTime = "3 BC",
            description = "It is believed to have been founded in the 7th century BC and was a major cultural and economic center of the region during the time of the Sogdian civilization.\n" +
                    "\n" +
                    "Afrosiab was destroyed by the armies of Alexander the Great in the 4th century BC, but it was later rebuilt and flourished as a center of trade and culture. It was an important stop on the Silk Road, the ancient trade route that connected China with the Mediterranean.\n" +
                    "\n" +
                    "Today, the remains of the ancient city can still be seen in Samarkand, including the walls and foundations of the old buildings. Visitors to the area can also see the Afrosiab Museum, which houses a collection of artifacts from the ancient town and provides insight into its rich history and culture."
        ),
        Sightseeing(
            id = 1,
            name = "Khazrat Khizr",
            oldImageId = R.drawable.khazrat_khizr_old,
            newImageId = R.drawable.khazrat_khizr_new,
            address = "Near the Siyab Bazaar",
            category = Category.Ancient,
            constructionTime = "7 AD",
            description = "There are many legends and stories associated with Khazrat Khizr in Islamic tradition. One of the most well-known stories involves Khazrat Khizr's encounter with the Prophet Moses.\n" +
                    "\n" +
                    "According to the legend, Moses was on a journey with his servant and was seeking Khazrat Khizr to learn from him. When they finally found him, Khazrat Khizr agreed to teach Moses, but warned him that he might not understand everything that he saw.\n" +
                    "\n" +
                    "The first test that Khazrat Khizr gave Moses was to make a hole in the bottom of a boat that they were traveling on. Moses was confused and protested, but Khazrat Khizr explained that he had damaged the boat in order to prevent it from being seized by a tyrant king who was confiscating all the boats in the area.\n" +
                    "\n" +
                    "Next, they came across a young boy whom Khazrat Khizr killed. Moses was horrified, but Khazrat Khizr explained that the boy was destined to grow up to be a wicked and disobedient son who would cause great sorrow to his parents. By killing him, Khazrat Khizr was able to save the parents from their future grief.\n" +
                    "\n" +
                    "Finally, they came to a village where the people refused to offer them hospitality. Khazrat Khizr miraculously repaired a crumbling wall in the village, but Moses was angry and asked why they had not been welcomed. Khazrat Khizr explained that the wall belonged to two orphans who lived in the village and that their father was a righteous man. If the wall had remained in disrepair, the orphans would have been vulnerable to thieves who would have taken their inheritance."
        ),
        Sightseeing(
            id = 2,
            name = "Guri Emir",
            oldImageId = R.drawable.guri_emir_old,
            newImageId = R.drawable.guri_emir_new,
            address = "Rui Gonzales Street",
            category = Category.Temurid,
            constructionTime = "15 AD",
            description = "Guri Emir is a mausoleum located in Samarkand, Uzbekistan. It was built in the 15th century as the final resting place of Timur, also known as Tamerlane, one of the greatest conquerors in Central Asian history, and several of his descendants.\n" +
                    "\n" +
                    "The name \"Guri Emir\" means \"Tomb of the King\" in the Persian language, and the mausoleum is considered one of the most significant examples of Timurid architecture. The building features a distinctive dome and ornate tile work, which reflects the intricate designs and craftsmanship of the Timurid era.\n" +
                    "\n" +
                    "In addition to Timur, the mausoleum contains the tombs of his sons Shahrukh and Miran Shah, as well as his grandson Ulugh Beg, who was a famous astronomer and mathematician.\n" +
                    "\n" +
                    "Today, Guri Emir is a popular tourist attraction in Samarkand and is considered one of the city's most important historical and cultural landmarks. Visitors can marvel at the stunning architecture and intricate tile work, as well as pay their respects to the great conqueror Timur and his descendants."
        ),
        Sightseeing(
            id = 3,
            name = "Observatory",
            oldImageId = R.drawable.observatory_old,
            newImageId = R.drawable.observator_new,
            address = "Kulak",
            category = Category.Temurid,
            constructionTime = "15 AD",
            description = "Ulugbek's Observatory is an astronomical observatory located in Samarkand, Uzbekistan. It was built by the Timurid ruler Ulugh Beg, who was a grandson of the famous conqueror Timur, and a renowned astronomer and mathematician himself. \n" +
                    "\n" +
                    "The observatory was constructed in the 1420s and was considered one of the most advanced of its time. It included a large sextant with a radius of 40 meters (131 feet), which was used to measure the positions of stars and planets with remarkable precision. Ulugh Beg and his team of astronomers used the observatory to create the \"Ulug Beg's Zij\", a star catalog containing the positions of over 1,000 stars.\n" +
                    "\n" +
                    "Unfortunately, Ulugh Beg's Observatory was destroyed in the 17th century, and only a portion of the sextant and some of the underground structures have survived to the present day. However, the remaining parts of the observatory have been carefully restored and preserved, and the site remains a popular attraction for tourists and astronomers alike.\n" +
                    "\n" +
                    "Visitors to the observatory can explore the underground chambers where the astronomical measurements were made, as well as view replicas of the instruments and tools used by Ulugh Beg and his team. The site also hosts various cultural events and festivals throughout the year, highlighting the rich history and scientific achievements of the Timurid era."
        ),
        Sightseeing(
            id = 4,
            name = "Bibi Khanum",
            oldImageId = R.drawable.bibi_khanum_old,
            newImageId = R.drawable.bibi_khanum_new,
            address = "Siyab Bazaar",
            category = Category.Temurid,
            constructionTime = "15 AD",
            description = "Here are three legends about Bibi Khanum." +
                    "\n" +
                    "The Legend of Bibi Khanum's Beauty: According to one legend, Bibi Khanum was renowned for her extraordinary beauty. Timur was said to have fallen in love with her at first sight, and he married her soon after. The legend goes that Bibi Khanum's beauty was so great that it inspired the construction of the Bibi Khanum Mosque in Samarkand, which Timur built as a tribute to his beloved wife.\n" +
                    "\n" +
                    "The Legend of Bibi Khanum's Generosity: Another legend depicts Bibi Khanum as a generous and compassionate woman who was beloved by the people of Samarkand. According to the legend, when Timur was away on military campaigns, Bibi Khanum would distribute food and clothing to the poor and needy in the city. She was said to have personally visited the sick and suffering, providing comfort and support to those in need.\n" +
                    "\n" +
                    "The Legend of the Blue Dome: This legend relates to the Bibi Khanum Mosque, which is one of the most famous landmarks in Samarkand. According to the legend, the dome of the mosque was originally built in white marble, but it collapsed soon after completion. Bibi Khanum ordered that the dome be rebuilt, but this time using blue tiles instead of white marble. The new dome was said to be even more beautiful than the original, and it remains one of the most striking features of the mosque to this day."
        ),
        Sightseeing(
            id = 5,
            name = "Shakhi-Zinda",
            oldImageId = R.drawable.shakhi_zinda_old,
            newImageId = R.drawable.shakhi_zinda_new,
            address = "Siyab Bazaar",
            category = Category.Temurid,
            constructionTime = "7-15 AD",
            description = "The complex is located on a hillside on the outskirts of Samarkand, and consists of several dozen mausoleums and other structures. The earliest structures date back to the 11th century, while the most recent additions were made in the 19th century.\n" +
                    "\n" +
                    "The mausoleums are decorated with intricate tilework, mosaics, and other decorative elements, and feature a variety of architectural styles and designs. Some of the most famous mausoleums include the mausoleum of Kusam-ibn-Abbas, a cousin of the Prophet Muhammad, and the mausoleum of Timur's sisters.\n" +
                    "\n" +
                    "According to legend, Shakhi Zinda was a cousin of the Prophet Muhammad who came to Samarkand in the 7th century to spread Islam. He was said to have been killed in battle, but his body remained miraculously preserved. The complex of mausoleums was built around his supposed burial place, and became an important site of pilgrimage and worship for Muslims throughout the region.\n" +
                    "\n" +
                    "In addition to its religious significance, Shakhi Zinda is also important for its historical and cultural significance. The complex is a testament to the artistic and architectural achievements of the various civilizations that have inhabited Samarkand over the centuries, including the Persians, Turks, and Mongols."
        ),
        Sightseeing(
            id = 6,
            name = "Rukhobad",
            oldImageId = R.drawable.rukhobod_old,
            newImageId = R.drawable.rukhobod_new,
            address = "Rui Gonzales Street",
            category = Category.Temurid,
            constructionTime = "13 AD",
            description = "According to the servants of the Mausoleum of Rukhabad in Samarkand, there is a legend about Burhaneddin Sagaraji, a scholar and Muslim from Mecca who was commissioned to go to Samarkand to strengthen the faith of the people. It was rumored that Samarkanders were spending less time on Islam. Burhaneddin met with the local clergy, talked to the people, and with his gift of persuasion, inspired them to follow the path to one God. After completing his mission, he went to China and met with the Emperor, who asked him to show a miracle to certify the fact that they should follow his religion. The court mage was summoned, and he soared into the sky. With his heart crying out to God, Burhaneddin took off his shoe and threw it at the magician, knocking him down. The people were amazed and decided to follow Burhaneddin's God. When Burhaneddin died, he was buried in Samarkand, along with his wife and nine children in the Mausoleum of Rukhabad. Legend has it that he owned a casket containing some of the hair of the Prophet Muhammad, which was walled into the base of the dome of the mausoleum. It is said that out of respect for the saint, Temur never rode past the Mausoleum on horseback, but dismounted and walked this stretch of road on foot. To this day, there is an unbroken trail to the tomb of the Saint."
        ),
        Sightseeing(
            id = 7,
            name = "Siyab Bazaar",
            oldImageId = R.drawable.siyob_old,
            newImageId = R.drawable.siyob_new,
            address = "In the old city",
            category = Category.Bazaar,
            constructionTime = "8 AD",
            description = "Siyab Bazaar is one of the largest and oldest bazaars in Samarkand, Uzbekistan. It is located in the eastern part of the city and is known for its vibrant and colorful atmosphere. The bazaar has a long history, dating back to the 8th century when it was a major center of trade along the Silk Road.\n" +
                    "\n" +
                    "Today, Siyab Bazaar is a popular destination for both locals and tourists alike. The market offers a wide variety of goods, including fresh produce, spices, textiles, ceramics, and handicrafts. It is also known for its traditional Uzbek bread, which is baked in large clay ovens and sold fresh throughout the day.\n" +
                    "\n" +
                    "Overall, Siyab Bazaar is a must-visit destination for anyone interested in experiencing the vibrant culture and history of Samarkand.\n"
        ),
        Sightseeing(
            id = 8,
            name = "Orthodox Church named after Aleksiy",
            oldImageId = null,
            newImageId = R.drawable.orthodox_church_new,
            address = "Near the boulevard",
            category = Category.Modern,
            constructionTime = "13 AD",
            description = "The St. Aleksiy Orthodox Church is located in the heart of Samarkand and is one of the most prominent religious buildings in the city. The church was built in the early 20th century, during the Russian Empire period, to serve the Russian Orthodox community living in Samarkand. It is named after Saint Alexis of Moscow, a 14th-century Russian Orthodox Metropolitan of Moscow and All Russia, who is revered as a patron saint of Russian land and the Moscow Kremlin.\n" +
                    "\n" +
                    "The architecture of the church is a blend of Russian Orthodox and Central Asian styles, which is reflected in the colorful and intricate mosaic decorations on the walls and the domes. The interior of the church is adorned with icons and murals that depict scenes from the life of Jesus and the saints.\n" +
                    "\n" +
                    "During the Soviet period, the church was closed and used for various secular purposes, but it was restored and reopened for worship in the 1990s, after Uzbekistan gained independence. Today, the church serves as the center of the Russian Orthodox community in Samarkand and hosts regular services and events.\n" +
                    "\n" +
                    "Visitors to the St. Aleksiy Orthodox Church can enjoy the peaceful and serene atmosphere inside the church, as well as admire the beautiful architecture and artwork. The church is also a great place to learn about the history and culture of the Russian Orthodox community in Samarkand and Uzbekistan."
        ),
        Sightseeing(
            id = 9,
            name = "St. John the Baptist Church",
            oldImageId = null,
            newImageId = R.drawable.kostel_new,
            address = "Near the boulevard",
            category = Category.Modern,
            constructionTime = "13 AD",
            description = "During the nineteenth century, a small Catholic minority consisting of merchants and employees of Polish or German origin settled in Samarkand. They requested permission to build a church in 1905 but were initially denied. However, when Polish prisoners of war from Poland, Prussia, and Austria arrived in 1915, the Catholic community was allowed to build their church on land purchased on Makhmud Kochgari Street. The neo-Gothic church was designed by architect Nelle and completed in 1916. In 1930, the Uzbek Soviet Socialist Republic closed the church and converted it into a school.\n" +
                    "\n" +
                    "In 1995, Father Ivan Rolloff initiated the process of officially registering the Catholic community of Samarkand, and in 1997 they were able to recover the church building. After undergoing restoration work, the church was dedicated on March 27, 1999. Today, the community is led by a Polish priest named Father Luciano Szymanski, who is assisted by two brothers from a Polish Franciscan monastery."
        ),
    )
    val categories = listOf<Category>(
        Category.Ancient,
        Category.Temurid,
        Category.Bazaar,
        Category.Modern
    )
}