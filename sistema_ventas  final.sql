-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-07-2022 a las 04:48:50
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistema_ventas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `codigo` int(12) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `NIT` int(12) NOT NULL,
  `correo` varchar(255) NOT NULL,
  `genero` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`codigo`, `nombre`, `NIT`, `correo`, `genero`) VALUES
(2, 'Abramo', 100001, 'adahill0@mail.ru', 'm'),
(3, 'Paxon', 100002, 'pgambrell1@walmart.com', 'f'),
(4, 'Codi', 100003, 'cjervois2@joomla.org', 'm'),
(6, 'Jamie', 100005, 'jbrosi4@redcross.org', 'f'),
(7, 'Giles', 100006, 'gcraydon5@surveymonkey.com', 'm'),
(9, 'Amos', 100008, 'arulf7@ow.ly', 'f'),
(10, 'Karney', 100009, 'kfilyukov8@elpais.com', 'm'),
(11, 'Tasia', 100010, 'tmiklem9@seattletimes.com', 'f'),
(12, 'Adham', 100011, 'afoyea@a8.net', 'm'),
(14, 'Steve', 100013, 'sstillyc@auda.org.au', 'f'),
(15, 'Anabel', 100014, 'ashoweringd@list-manage.com', 'f'),
(16, 'Mignon', 100015, 'mpatmoree@prnewswire.com', 'm'),
(19, 'Marijo', 100018, 'mvardieh@dailymotion.com', 'm'),
(20, 'Zora', 100019, 'zbinesteadi@hhs.gov', 'm'),
(21, 'Tamra', 100020, 'tcotterellj@abc.net.au', 'f'),
(22, 'Helen', 100021, 'hsedenk@engadget.com', 'm'),
(23, 'Goldy', 100022, 'gbettlesonl@about.me', 'f'),
(24, 'Leila', 100023, 'ledworthyem@hibu.com', 'm'),
(26, 'Everett', 100025, 'ekunzeo@nba.com', 'f'),
(27, 'Ruthi', 100026, 'rsumblerp@shareasale.com', 'm'),
(28, 'Karlens', 100027, 'kdenizetq@loc.gov', 'm'),
(30, 'Junia', 100029, 'jgrovess@va.gov', 'm'),
(31, 'Caprice', 100030, 'cthoulesst@bloglines.com', 'm'),
(32, 'Kass', 100031, 'klambdeanu@dion.ne.jp', 'm'),
(33, 'Cleveland', 100032, 'cscreechv@tinyurl.com', 'f'),
(34, 'Ludwig', 100033, 'lirnysw@unicef.org', 'f'),
(35, 'Remy', 100034, 'rbauducciox@geocities.jp', 'm'),
(36, 'Kathi', 100035, 'ksnelley@google.it', 'm'),
(37, 'Erny', 100036, 'efassumz@cisco.com', 'm'),
(38, 'Barry', 100037, 'bpenberthy10@nsw.gov.au', 'm'),
(39, 'Ryan', 100038, 'rbrunone11@harvard.edu', 'm'),
(40, 'Korie', 100039, 'klies12@t.co', 'f'),
(41, 'Darbie', 100040, 'ddibartolomeo13@bloglines.com', 'm'),
(42, 'Galen', 100041, 'gfranciskiewicz14@myspace.com', 'm'),
(43, 'Obidiah', 100042, 'ocurtiss15@usa.gov', 'm'),
(44, 'Errol', 100043, 'emessam16@cdbaby.com', 'm'),
(45, 'Demetris', 100044, 'ddeal17@vistaprint.com', 'm'),
(46, 'Ahmad', 100045, 'aitzig18@mapquest.com', 'm'),
(47, 'Rodrique', 100046, 'rhawksby19@odnoklassniki.ru', 'm'),
(48, 'Woodie', 100047, 'wpotapczuk1a@blinklist.com', 'f'),
(49, 'Kattie', 100048, 'krunnalls1b@unblog.fr', 'm'),
(50, 'Breena', 100049, 'bmiltonwhite1c@seattletimes.com', 'm'),
(51, 'Jere', 100050, 'jseamon1d@slideshare.net', 'f'),
(52, 'Eveline', 100051, 'eomarkey1e@ask.com', 'f'),
(53, 'Klarika', 100052, 'kcrigin1f@indiatimes.com', 'm'),
(54, 'Mohandas', 100053, 'murch1g@tuttocitta.it', 'm'),
(55, 'Lorettalorna', 100054, 'lboarder1h@irs.gov', 'f'),
(56, 'Deana', 100055, 'dpengelly1i@seesaa.net', 'f'),
(57, 'Spencer', 100056, 'shouseman1j@dell.com', 'm'),
(58, 'Edlin', 100057, 'ecrofthwaite1k@google.co.uk', 'f'),
(59, 'Tanya', 100058, 'tbester1l@sakura.ne.jp', 'm'),
(60, 'Pattin', 100059, 'pkeson1m@ycombinator.com', 'm'),
(61, 'Ciro', 100060, 'clitt1n@elegantthemes.com', 'm'),
(62, 'Rafe', 100061, 'rkolis1o@time.com', 'm'),
(63, 'Skippie', 100062, 'ssteptow1p@pcworld.com', 'f'),
(64, 'Berget', 100063, 'bettery1q@scribd.com', 'f'),
(65, 'Hanson', 100064, 'helmes1r@google.it', 'm'),
(66, 'Laurel', 100065, 'lunderdown1s@jiathis.com', 'f'),
(67, 'Ogdan', 100066, 'ofeitosa1t@elpais.com', 'f'),
(68, 'Bay', 100067, 'bhellwing1u@xing.com', 'f'),
(69, 'Minette', 100068, 'mfrancom1v@columbia.edu', 'm'),
(70, 'Blythe', 100069, 'bjahn1w@t.co', 'm'),
(71, 'Nance', 100070, 'nkobelt1x@nifty.com', 'f'),
(72, 'Wade', 100071, 'wshoulders1y@tinypic.com', 'm'),
(73, 'Valaria', 100072, 'vthomazet1z@telegraph.co.uk', 'm'),
(74, 'Consolata', 100073, 'cladel20@time.com', 'f'),
(75, 'Angelica', 100074, 'aigo21@hp.com', 'f'),
(76, 'Bernete', 100075, 'bfleetwood22@walmart.com', 'f');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `codigo` int(12) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `cantidad` int(255) NOT NULL,
  `precio` decimal(3,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`codigo`, `nombre`, `descripcion`, `cantidad`, `precio`) VALUES
(1, 'banano', 'sdasd', 213, '123'),
(3, 'Energy Drink', 'Cremin and Sons', 36, '291'),
(6, 'Pails With Lids', 'Jakubowski-Kling', 37, '906'),
(7, 'Sparkling Wine - Rose, Freixenet', 'Schowalter-Morissette', 46, '443'),
(9, 'Herb Du Provence - Primerba', 'Emard, Haag and Larkin', 39, '100'),
(11, 'Coffee Cup 8oz 5338cd', 'Simonis-Mohr', 2, '777'),
(12, 'Lettuce - Boston Bib', 'Cremin-Hintz', 11, '987'),
(14, 'Mushroom - King Eryingii', 'Kilback, Goyette and Padberg', 64, '5'),
(15, 'Tortillas - Flour, 8', 'Mohr and Sons', 38, '774'),
(16, 'Chevere Logs', 'Macejkovic, Heathcote and Keeling', 37, '401'),
(17, 'Tea - Decaf Lipton', 'Ledner-Abshire', 2, '363'),
(18, 'Lettuce - Iceberg', 'Osinski-Runolfsdottir', 9, '83'),
(19, 'Chips Potato Salt Vinegar 43g', 'Mueller, Moen and Kirlin', 41, '978'),
(20, 'Mushroom - Oyster, Fresh', 'Hudson-Beahan', 44, '962'),
(21, 'Peas - Pigeon, Dry', 'Jakubowski, Morissette and Kulas', 35, '877'),
(22, 'Gatorade - Xfactor Berry', 'Kassulke-Hand', 79, '840'),
(23, 'Smoked Tongue', 'Haley LLC', 30, '667'),
(24, 'Carrots - Mini, Stem On', 'Gislason, Runolfsson and Murazik', 35, '192'),
(25, 'Cake - Pancake', 'Barrows Inc', 53, '501'),
(26, 'Sauce - Vodka Blush', 'Torp, Howe and Daniel', 30, '382'),
(27, 'Rice - Wild', 'Grant-Leffler', 13, '970'),
(28, 'Rolled Oats', 'Ward and Sons', 26, '348'),
(29, 'Miso - Soy Bean Paste', 'Leffler Inc', 28, '526'),
(30, 'Parsley Italian - Fresh', 'McCullough-Trantow', 86, '950'),
(31, 'Carroway Seed', 'Cummerata and Sons', 32, '993'),
(32, 'Beef - Bresaola', 'Jones LLC', 79, '789'),
(33, 'Sausage - Blood Pudding', 'Bailey, Powlowski and Hermiston', 53, '287'),
(34, 'Sausage - Blood Pudding', 'Morissette and Sons', 27, '905'),
(35, 'Appetizer - Mango Chevre', 'Bruen LLC', 73, '859'),
(36, 'Squeeze Bottle', 'Barton and Sons', 27, '692'),
(37, 'Ham - Virginia', 'Schowalter-Anderson', 62, '392'),
(38, 'Wine - Riesling Dr. Pauly', 'Wyman-Ritchie', 40, '634'),
(39, 'Pastrami', 'Kutch, Roberts and Koelpin', 92, '145'),
(40, 'Mince Meat - Filling', 'Crooks-Olson', 75, '597'),
(41, 'Mushroom - Crimini', 'Lockman, Hansen and Maggio', 20, '972'),
(42, 'Cookie Double Choco', 'Ryan LLC', 93, '130'),
(43, 'Pear - Packum', 'Ledner Inc', 2, '539'),
(44, 'Peach - Halves', 'VonRueden, Langworth and Ebert', 42, '604'),
(45, 'Radish - Black, Winter, Organic', 'Stiedemann, Jerde and Kilback', 45, '87'),
(46, 'Beets - Candy Cane, Organic', 'Walsh-Walter', 13, '314'),
(47, 'Juice - Propel Sport', 'Jast-Bogan', 2, '862'),
(48, 'Island Oasis - Banana Daiquiri', 'Kessler Inc', 33, '490'),
(49, 'Bread - White, Unsliced', 'Morar, Leuschke and Lehner', 77, '931'),
(50, 'Wine - Pinot Noir Stoneleigh', 'Keebler Inc', 83, '635'),
(51, 'Cake - Dulce De Leche', 'Daniel-Glover', 15, '348'),
(52, 'Bay Leaf Fresh', 'Koelpin Group', 19, '392'),
(53, 'Beer - Camerons Auburn', 'Osinski Group', 23, '679'),
(54, 'Potatoes - Yukon Gold, 80 Ct', 'Will-Hackett', 78, '644'),
(55, 'Soap - Hand Soap', 'Rempel-Romaguera', 10, '568'),
(56, 'Broom - Angled', 'Johnston, Gleason and Beatty', 82, '562'),
(57, 'Milk - Chocolate 500ml', 'Hayes-Harvey', 62, '264'),
(58, 'Chickhen - Chicken Phyllo', 'Bayer-Nolan', 95, '653'),
(59, 'Ecolab - Solid Fusion', 'Durgan, Welch and Leffler', 75, '941'),
(60, 'Relish', 'Hegmann, Rau and Thiel', 73, '172'),
(61, 'Beef Striploin Aaa', 'Maggio-Schiller', 50, '157'),
(62, 'Chicken - Livers', 'Hoppe-Mann', 12, '750'),
(63, 'Pepsi - Diet, 355 Ml', 'O\'Conner and Sons', 39, '277'),
(64, 'Yoplait Drink', 'Heidenreich, Braun and Kiehn', 24, '684'),
(65, 'Table Cloth 81x81 Colour', 'Huel and Sons', 37, '901'),
(66, 'Bandage - Fexible 1x3', 'Kihn Group', 17, '970'),
(67, 'Egg - Salad Premix', 'Anderson, Spencer and Legros', 30, '520'),
(68, 'Garbage Bag - Clear', 'Bergstrom, Witting and Lubowitz', 82, '585'),
(69, 'Bread - Dark Rye', 'VonRueden Inc', 34, '575'),
(70, 'Wine - Rosso Del Veronese Igt', 'Mohr-McDermott', 20, '600'),
(71, 'Pheasants - Whole', 'Waters Inc', 4, '117'),
(72, 'Cookie Dough - Chunky', 'Ondricka, Hauck and Runolfsdottir', 38, '665'),
(73, 'Soup Campbells Split Pea And Ham', 'Heidenreich Inc', 83, '811'),
(74, 'Coconut - Creamed, Pure', 'Huel and Sons', 11, '34'),
(75, 'Pastry - Chocolate Chip Muffin', 'Schuster-Runte', 39, '211'),
(76, 'Bagel - Everything', 'Tremblay, Goldner and Gislason', 77, '945'),
(77, 'Potatoes - Yukon Gold, 80 Ct', 'Rogahn and Sons', 6, '399'),
(78, 'Stainless Steel Cleaner Vision', 'Russel, Ruecker and Stehr', 82, '694'),
(79, 'Squash - Pepper', 'Osinski and Sons', 20, '396'),
(80, 'Pork - Back Ribs', 'Kertzmann, Abshire and Terry', 98, '343'),
(81, 'Wine - White, Riesling, Henry Of', 'Schuster-Dach', 5, '763'),
(82, 'Barramundi', 'Hodkiewicz Group', 57, '331'),
(83, 'Sesame Seed', 'Sauer, Murray and Haag', 64, '820'),
(84, 'Vol Au Vents', 'Sanford and Sons', 66, '552'),
(85, 'Sauce - Thousand Island', 'Runte Inc', 49, '281'),
(86, 'Sambuca - Opal Nera', 'Reinger LLC', 56, '950'),
(87, 'Soup Campbells Split Pea And Ham', 'Ondricka-Johns', 37, '196'),
(88, 'Lettuce - Lolla Rosa', 'Moore, Kshlerin and Hand', 26, '811'),
(89, 'Extract - Lemon', 'Lynch, Douglas and Dickens', 95, '981'),
(90, 'Bread - Sour Batard', 'Cartwright-Jacobson', 86, '581'),
(91, 'Juice - Grapefruit, 341 Ml', 'Grant, Hermiston and Kohler', 11, '542'),
(92, 'Shrimp - Black Tiger 16/20', 'Brown, Gerhold and Stracke', 53, '667'),
(93, 'Table Cloth 81x81 White', 'Murray-Homenick', 58, '190'),
(94, 'Chocolate - Dark Callets', 'Skiles-Lang', 71, '207'),
(95, 'Garlic Powder', 'Hills-Morar', 12, '897'),
(96, 'C - Plus, Orange', 'Runolfsdottir LLC', 91, '52'),
(97, 'Sproutsmustard Cress', 'Kohler, Mitchell and Stiedemann', 1, '625'),
(98, 'Bread - Sour Sticks With Onion', 'Klocko and Sons', 96, '157'),
(99, 'Chocolate - Unsweetened', 'Klein-Kuvalis', 90, '539'),
(100, 'Tomatoes - Roma', 'Parisian-Bauch', 24, '532'),
(101, 'Crab Brie In Phyllo', 'Auer Inc', 68, '180'),
(102, 'Chocolate Liqueur - Godet White', 'Beier-Kautzer', 13, '445'),
(103, 'Veal Inside - Provimi', 'VonRueden-Zulauf', 27, '537'),
(104, 'Muffin - Mix - Strawberry Rhubarb', 'Luettgen-Beer', 55, '167'),
(105, 'Pork - Butt, Boneless', 'Bruen-Friesen', 82, '572'),
(106, 'Mushroom - Shitake, Dry', 'Bartoletti Group', 19, '198'),
(107, 'Tomatillo', 'Batz Inc', 15, '597'),
(108, 'Crab Meat Claw Pasteurise', 'Olson-Cruickshank', 62, '971'),
(109, 'Soup - French Can Pea', 'Witting Inc', 14, '96'),
(110, 'Shichimi Togarashi Peppeers', 'Dietrich-Lang', 24, '794'),
(111, 'Halibut - Whole, Fresh', 'Gottlieb-Friesen', 4, '166'),
(112, 'Apricots Fresh', 'Tremblay, Halvorson and Reinger', 77, '974'),
(113, 'Cake - Box Window 10x10x2.5', 'Koss-Littel', 1, '776'),
(114, 'Russian Prince', 'Bernhard, Skiles and Green', 55, '211'),
(115, 'Appetizer - Sausage Rolls', 'Considine LLC', 30, '34'),
(116, 'Mushroom - Chanterelle, Dry', 'Marquardt and Sons', 90, '785'),
(117, 'Vacuum Bags 12x16', 'Smitham-Quitzon', 32, '341'),
(118, 'Wine - Maipo Valle Cabernet', 'Kihn, Cartwright and Cummings', 44, '861'),
(119, 'Dc - Sakura Fu', 'Nikolaus-Moore', 16, '863'),
(120, 'Chicken - Base, Ultimate', 'Rolfson and Sons', 38, '873'),
(121, 'Lid - Translucent, 3.5 And 6 Oz', 'Hammes-Olson', 99, '369'),
(122, '7up Diet, 355 Ml', 'Jones, Abbott and Hirthe', 91, '53'),
(123, 'Coffee - Cafe Moreno', 'Spencer, Cruickshank and Kihn', 68, '796'),
(124, 'Tea - Orange Pekoe', 'Treutel, Connelly and Gibson', 10, '530'),
(125, 'Turkey - Oven Roast Breast', 'Mraz, Herman and Bogisich', 83, '833'),
(126, 'Pecan Raisin - Tarts', 'Brakus-Kassulke', 75, '107'),
(127, 'Beef - Shank', 'Cummerata-Wiegand', 83, '89'),
(128, 'Oil - Olive Bertolli', 'Smitham-Torphy', 20, '138'),
(129, 'Bagelers - Cinn / Brown', 'Douglas Inc', 37, '379'),
(130, 'Taro Root', 'Gutkowski, Nicolas and Bahringer', 74, '392'),
(131, 'Ecolab - Hobart Washarm End Cap', 'Bayer, Johns and Breitenberg', 52, '272'),
(132, 'Calvados - Boulard', 'Deckow and Sons', 32, '793'),
(133, 'Cut Wakame - Hanawakaba', 'Auer LLC', 87, '220'),
(134, 'Mushroom - Trumpet, Dry', 'Hegmann-Baumbach', 41, '483'),
(135, 'Cookies - Assorted', 'Macejkovic, Pouros and Kuhn', 11, '978'),
(136, 'Jolt Cola - Red Eye', 'Shields LLC', 97, '576'),
(137, 'Marsala - Sperone, Fine, D.o.c.', 'Hoeger and Sons', 13, '315');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos_ventas`
--

CREATE TABLE `productos_ventas` (
  `id_productoVentas` int(12) NOT NULL,
  `codigo` int(12) NOT NULL,
  `cantidad` int(255) NOT NULL,
  `subtotal` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sucursales`
--

CREATE TABLE `sucursales` (
  `codigo` int(12) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `correo` varchar(255) NOT NULL,
  `telefono` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `sucursales`
--

INSERT INTO `sucursales` (`codigo`, `nombre`, `direccion`, `correo`, `telefono`) VALUES
(17, 'aaaaaa', 'aaaaa', 'jyounglovef@nymag.com', 2446769),
(18, 'sssss', '0261 Nancy Trail', 'pharlingg@tinypic.com', 2479013),
(19, 'Macejkovic-VonRueden', '09 Lillian Hill', 'mespinhah@jiathis.com', 2429016),
(20, 'Bailey Group', '3586 Amoth Crossing', 'wgerriti@bloomberg.com', 2495423),
(22, 'Mayer, Roob and Wiza', '0 Manitowish Way', 'pbernardeschik@dion.ne.jp', 2421944),
(23, 'O\'Reilly LLC', '516 Forest Dale Crossing', 'sbirkinshawl@geocities.jp', 2498929),
(24, 'Stokes-Aufderhar', '8370 Texas Hill', 'mpykem@clickbank.net', 2460801),
(25, 'Hettinger-Erdman', '400 Pankratz Circle', 'pciobutaron@virginia.edu', 2489219),
(28, 'Kautzer, Parker and Parker', '3 Thompson Avenue', 'jbalsdoneq@cornell.edu', 2422883),
(29, 'Greenfelder-Gerhold', '63383 Stoughton Terrace', 'ialdenr@omniture.com', 2415828),
(30, 'Daniel Group', '792 Golf Court', 'sbailes@bloglovin.com', 2400128),
(31, 'Waelchi, Johnston and King', '07014 Pepper Wood Terrace', 'kroskellyt@icq.com', 2473716),
(32, 'Weimann-Gutmann', '4815 Florence Way', 'avinnicombeu@nps.gov', 2421796),
(33, 'Runte-Jacobs', '98 Oxford Pass', 'bdumbletonv@amazon.com', 2413952),
(34, 'Gutmann LLC', '71 Bultman Place', 'bsawneyw@mozilla.org', 2402369),
(37, 'Bogisich, Torphy and Lakin', '37 Service Avenue', 'blauxmannz@prweb.com', 2472322),
(38, 'Kuhn, Douglas and Davis', '20 Lotheville Court', 'erenachowski10@networkadvertising.org', 2489525),
(39, 'Bechtelar Inc', '02429 Atwood Place', 'jkillock11@yandex.ru', 2417564),
(41, 'Reilly, Hansen and DuBuque', '6282 Swallow Parkway', 'goscollee13@xinhuanet.com', 2491745),
(42, 'sdasd', 'asdasd', 'sdasd', 1233),
(43, 'Liz', 'mixco 1', 'sdasd', 123213213),
(44, 'dasd', 'asdasd', 'dasd', 23123123),
(45, 'dsadasd', 'asdasd', 'asdas', 213123),
(47, 'asdasd', 'sadasd', 'asdasd', 1111),
(48, 'dasda', 'asdas', 'asd', 213213),
(49, 'aaaaaa', 'aaaaa', 'aaaaa', 11111);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedores`
--

CREATE TABLE `vendedores` (
  `codigo` int(12) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `caja` int(3) NOT NULL,
  `ventas` int(4) NOT NULL,
  `genero` char(1) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `vendedores`
--

INSERT INTO `vendedores` (`codigo`, `nombre`, `caja`, `ventas`, `genero`, `password`) VALUES
(2, 'sdad', 123, 12, 'f', '123'),
(3, 'Katrinka', 101, 0, 'm', 'Katrinka'),
(4, 'Katleen', 102, 0, 'm', 'Katleen'),
(5, 'Felizio', 103, 0, 'm', 'Felizio'),
(6, 'Arnie', 104, 0, 'f', 'Arnie'),
(7, 'Edwin', 105, 0, 'f', 'Edwin'),
(8, 'Laurens', 106, 0, 'f', 'Laurens'),
(9, 'Allianora', 107, 0, 'm', 'Allianora'),
(10, 'Johnnie', 108, 0, 'f', 'Johnnie'),
(11, 'juan', 109, 0, 'm', 'Kala'),
(12, 'Terrijo', 110, 0, 'm', 'Terrijo'),
(13, 'Broderick', 111, 0, 'f', 'Broderick'),
(14, 'Junia', 112, 0, 'm', 'Junia'),
(15, 'Myrah', 113, 0, 'm', 'Myrah'),
(16, 'Wendeline', 114, 0, 'm', 'Wendeline'),
(17, 'Malcolm', 115, 0, 'm', 'Malcolm'),
(18, 'Otis', 116, 0, 'm', 'Otis'),
(19, 'Sanford', 117, 0, 'm', 'Sanford'),
(20, 'Bar', 118, 0, 'm', 'Bar'),
(21, 'Dulcia', 119, 0, 'm', 'Dulcia'),
(22, 'Lynelle', 120, 0, 'm', 'Lynelle'),
(23, 'Thane', 121, 0, 'f', 'Thane'),
(24, 'Hadria', 122, 0, 'f', 'Hadria'),
(25, 'Jeth', 123, 0, 'm', 'Jeth'),
(26, 'Ax', 124, 0, 'm', 'Ax'),
(27, 'Ray', 125, 0, 'm', 'Ray'),
(28, 'Saree', 126, 0, 'f', 'Saree'),
(29, 'Milton', 127, 0, 'f', 'Milton'),
(30, 'Brietta', 128, 0, 'm', 'Brietta'),
(31, 'Edgardo', 129, 0, 'm', 'Edgardo'),
(32, 'Celle', 130, 0, 'f', 'Celle'),
(33, 'Vonni', 131, 0, 'f', 'Vonni'),
(34, 'Audry', 132, 0, 'f', 'Audry'),
(35, 'Quintus', 133, 0, 'm', 'Quintus'),
(36, 'Jammie', 134, 0, 'f', 'Jammie'),
(37, 'Sigismondo', 135, 0, 'm', 'Sigismondo'),
(38, 'Woodrow', 136, 0, 'f', 'Woodrow'),
(39, 'Armand', 137, 0, 'm', 'Armand'),
(40, 'Carce', 138, 0, 'm', 'Carce'),
(41, 'Damaris', 139, 0, 'm', 'Damaris'),
(42, 'Libbi', 140, 0, 'm', 'Libbi'),
(43, 'Graham', 141, 0, 'f', 'Graham'),
(44, 'Ollie', 142, 0, 'f', 'Ollie'),
(45, 'Beilul', 143, 0, 'f', 'Beilul'),
(46, 'Carolee', 144, 0, 'm', 'Carolee'),
(47, 'Valery', 145, 0, 'm', 'Valery'),
(48, 'Alicia', 146, 0, 'm', 'Alicia'),
(49, 'Selle', 147, 0, 'f', 'Selle'),
(50, 'Cindra', 148, 0, 'm', 'Cindra'),
(51, 'Loni', 149, 0, 'm', 'Loni'),
(52, 'Ferdinanda', 150, 0, 'm', 'Ferdinanda'),
(53, 'Giovanni', 151, 0, 'f', 'Giovanni'),
(54, 'Gawen', 152, 0, 'm', 'Gawen'),
(55, 'Violette', 153, 0, 'm', 'Violette'),
(56, 'Raquel', 154, 0, 'm', 'Raquel'),
(57, 'Pandora', 155, 0, 'm', 'Pandora'),
(58, 'Marve', 156, 0, 'f', 'Marve'),
(59, 'Lenee', 157, 0, 'm', 'Lenee'),
(60, 'Marji', 158, 0, 'f', 'Marji'),
(61, 'Conrado', 159, 0, 'f', 'Conrado'),
(62, 'Lynde', 160, 0, 'm', 'Lynde'),
(63, 'Sisely', 161, 0, 'f', 'Sisely'),
(64, 'Willey', 162, 0, 'm', 'Willey'),
(65, 'Sharl', 163, 0, 'f', 'Sharl'),
(66, 'Hannis', 164, 0, 'f', 'Hannis'),
(67, 'Allen', 165, 0, 'm', 'Allen'),
(68, 'Kelwin', 166, 0, 'f', 'Kelwin'),
(69, 'Zerk', 167, 0, 'f', 'Zerk'),
(70, 'Talbot', 168, 0, 'm', 'Talbot'),
(71, 'Jacqueline', 169, 0, 'm', 'Jacqueline'),
(72, 'Nessy', 170, 0, 'f', 'Nessy'),
(73, 'Hale', 171, 0, 'm', 'Hale'),
(74, 'Garrick', 172, 0, 'm', 'Garrick'),
(75, 'Davidde', 173, 0, 'm', 'Davidde'),
(76, 'Leonardo', 174, 0, 'f', 'Leonardo'),
(77, 'Wolfy', 175, 0, 'f', 'Wolfy'),
(78, 'Skippie', 176, 0, 'f', 'Skippie'),
(79, 'Corena', 177, 0, 'm', 'Corena'),
(80, 'Charmion', 178, 0, 'f', 'Charmion'),
(81, 'Mariellen', 179, 0, 'f', 'Mariellen'),
(82, 'Ashlee', 180, 0, 'm', 'Ashlee'),
(83, 'Kristofer', 181, 0, 'f', 'Kristofer'),
(84, 'Darla', 182, 0, 'm', 'Darla'),
(85, 'Bonny', 183, 0, 'f', 'Bonny'),
(86, 'Regine', 184, 0, 'f', 'Regine'),
(87, 'Tracee', 185, 0, 'm', 'Tracee'),
(88, 'Hughie', 186, 0, 'm', 'Hughie'),
(89, 'Cobbie', 187, 0, 'm', 'Cobbie'),
(90, 'Monika', 188, 0, 'f', 'Monika'),
(91, 'Ramsay', 189, 0, 'm', 'Ramsay'),
(92, 'Oralie', 190, 0, 'f', 'Oralie'),
(93, 'Kenneth', 191, 0, 'f', 'Kenneth'),
(94, 'Marylynne', 192, 0, 'm', 'Marylynne'),
(95, 'Rochelle', 193, 0, 'm', 'Rochelle'),
(96, 'Anica', 194, 0, 'm', 'Anica'),
(97, 'Stan', 195, 0, 'f', 'Stan'),
(98, 'Donnie', 196, 0, 'f', 'Donnie'),
(99, 'Jenna', 197, 0, 'f', 'Jenna'),
(100, 'Colene', 198, 0, 'm', 'Colene'),
(101, 'Marlo', 199, 0, 'm', 'Marlo'),
(102, 'Saloma', 200, 0, 'f', 'Saloma'),
(103, 'Karalynn', 201, 0, 'f', 'Karalynn'),
(104, 'Dacy', 202, 0, 'm', 'Dacy'),
(105, 'Kendra', 203, 0, 'm', 'Kendra'),
(106, 'Hildegarde', 204, 0, 'm', 'Hildegarde'),
(107, 'Sutherlan', 205, 0, 'm', 'Sutherlan'),
(108, 'June', 206, 0, 'f', 'June'),
(109, 'Meggy', 207, 0, 'm', 'Meggy'),
(110, 'Cristina', 208, 0, 'm', 'Cristina'),
(111, 'Colly', 209, 0, 'f', 'Colly'),
(112, 'Alexandro', 210, 0, 'f', 'Alexandro'),
(113, 'Zolly', 211, 0, 'f', 'Zolly'),
(114, 'Roberto', 212, 0, 'm', 'Roberto'),
(115, 'Claudette', 213, 0, 'f', 'Claudette'),
(116, 'Candide', 214, 0, 'm', 'Candide'),
(117, 'Zorah', 215, 0, 'm', 'Zorah'),
(118, 'Nancee', 216, 0, 'f', 'Nancee'),
(119, 'Kory', 217, 0, 'f', 'Kory'),
(120, 'Stanislaus', 218, 0, 'f', 'Stanislaus'),
(121, 'Orran', 219, 0, 'f', 'Orran'),
(122, 'Margery', 220, 0, 'm', 'Margery'),
(123, 'Etta', 221, 0, 'm', 'Etta'),
(124, 'Callie', 222, 0, 'f', 'Callie'),
(125, 'Jolynn', 223, 0, 'f', 'Jolynn'),
(126, 'Jesselyn', 224, 0, 'm', 'Jesselyn'),
(127, 'Cirillo', 225, 0, 'f', 'Cirillo'),
(128, 'Laney', 226, 0, 'm', 'Laney'),
(129, 'Minny', 227, 0, 'f', 'Minny'),
(130, 'Vin', 228, 0, 'm', 'Vin'),
(131, 'Karita', 229, 0, 'f', 'Karita'),
(132, 'Rickie', 230, 0, 'f', 'Rickie'),
(133, 'Tris', 231, 0, 'f', 'Tris'),
(134, 'Aile', 232, 0, 'm', 'Aile'),
(135, 'Grover', 233, 0, 'f', 'Grover'),
(136, 'Flora', 234, 0, 'm', 'Flora'),
(137, 'Jeffry', 235, 0, 'm', 'Jeffry'),
(138, 'Gustavus', 236, 0, 'f', 'Gustavus'),
(139, 'Ada', 237, 0, 'm', 'Ada'),
(140, 'Jenn', 238, 0, 'f', 'Jenn'),
(141, 'Nata', 239, 0, 'm', 'Nata'),
(142, 'Merissa', 240, 0, 'f', 'Merissa'),
(143, 'Tate', 241, 0, 'm', 'Tate'),
(144, 'Prent', 242, 0, 'f', 'Prent'),
(145, 'Rickie', 243, 0, 'f', 'Rickie'),
(146, 'Meridith', 244, 0, 'f', 'Meridith'),
(147, 'Reina', 245, 0, 'f', 'Reina'),
(148, 'Ellsworth', 246, 0, 'm', 'Ellsworth'),
(149, 'Prentice', 247, 0, 'f', 'Prentice'),
(150, 'Nanny', 248, 0, 'm', 'Nanny'),
(151, 'Ofelia', 249, 0, 'f', 'Ofelia'),
(152, 'Birk', 250, 0, 'm', 'Birk'),
(153, 'Deirdre', 251, 0, 'f', 'Deirdre'),
(154, 'Ashly', 252, 0, 'f', 'Ashly'),
(155, 'Lucias', 253, 0, 'f', 'Lucias'),
(156, 'Urban', 254, 0, 'm', 'Urban'),
(157, 'Bronny', 255, 0, 'f', 'Bronny'),
(158, 'Averyl', 256, 0, 'm', 'Averyl'),
(159, 'Sheilakathryn', 257, 0, 'm', 'Sheilakathryn'),
(160, 'Vinnie', 258, 0, 'f', 'Vinnie'),
(161, 'Ferdinand', 259, 0, 'f', 'Ferdinand'),
(162, 'Peirce', 260, 0, 'm', 'Peirce'),
(163, 'Oliver', 261, 0, 'f', 'Oliver'),
(164, 'Letizia', 262, 0, 'f', 'Letizia'),
(165, 'Inglis', 263, 0, 'f', 'Inglis'),
(166, 'Tisha', 264, 0, 'm', 'Tisha'),
(167, 'Thomasin', 265, 0, 'm', 'Thomasin'),
(168, 'Joyann', 266, 0, 'm', 'Joyann'),
(169, 'Glenine', 267, 0, 'm', 'Glenine'),
(170, 'Ashia', 268, 0, 'f', 'Ashia'),
(171, 'Clarice', 269, 0, 'f', 'Clarice'),
(172, 'Gerrard', 270, 0, 'm', 'Gerrard'),
(173, 'Aurore', 271, 0, 'm', 'Aurore'),
(174, 'Ashlen', 272, 0, 'f', 'Ashlen'),
(175, 'Celeste', 273, 0, 'f', 'Celeste'),
(176, 'Alecia', 274, 0, 'f', 'Alecia'),
(177, 'Fannie', 275, 0, 'f', 'Fannie'),
(178, 'Luke', 276, 0, 'm', 'Luke'),
(179, 'Lilian', 277, 0, 'm', 'Lilian'),
(180, 'Bertram', 278, 0, 'm', 'Bertram'),
(181, 'Giacopo', 279, 0, 'f', 'Giacopo'),
(182, 'Maggi', 280, 0, 'f', 'Maggi'),
(183, 'Roxy', 281, 0, 'f', 'Roxy'),
(184, 'Burch', 282, 0, 'f', 'Burch'),
(185, 'Kip', 283, 0, 'f', 'Kip'),
(186, 'Ruthi', 284, 0, 'm', 'Ruthi'),
(187, 'Avictor', 285, 0, 'm', 'Avictor'),
(188, 'Rosamond', 286, 0, 'f', 'Rosamond'),
(189, 'Chad', 287, 0, 'f', 'Chad'),
(190, 'Karin', 288, 0, 'm', 'Karin'),
(191, 'Brandon', 289, 0, 'f', 'Brandon'),
(192, 'Remus', 290, 0, 'f', 'Remus'),
(193, 'Millisent', 291, 0, 'f', 'Millisent'),
(194, 'Karissa', 292, 0, 'm', 'Karissa'),
(195, 'Bayard', 293, 0, 'm', 'Bayard'),
(196, 'Agnella', 294, 0, 'f', 'Agnella'),
(197, 'Britta', 295, 0, 'f', 'Britta'),
(198, 'Jeffry', 296, 0, 'f', 'Jeffry'),
(199, 'Natalee', 297, 0, 'm', 'Natalee'),
(200, 'Andee', 298, 0, 'f', 'Andee'),
(201, 'Keefer', 299, 0, 'm', 'Keefer'),
(202, 'Christean', 300, 0, 'f', 'Christean');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `id_ventas` int(12) NOT NULL,
  `codigo` int(12) NOT NULL,
  `fecha` date NOT NULL,
  `id_productosVentas` int(12) NOT NULL,
  `total` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `productos_ventas`
--
ALTER TABLE `productos_ventas`
  ADD PRIMARY KEY (`id_productoVentas`),
  ADD KEY `codigo` (`codigo`);

--
-- Indices de la tabla `sucursales`
--
ALTER TABLE `sucursales`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `vendedores`
--
ALTER TABLE `vendedores`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD KEY `codigo` (`codigo`),
  ADD KEY `id_productosVentas` (`id_productosVentas`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `codigo` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=77;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `codigo` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=138;

--
-- AUTO_INCREMENT de la tabla `sucursales`
--
ALTER TABLE `sucursales`
  MODIFY `codigo` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=50;

--
-- AUTO_INCREMENT de la tabla `vendedores`
--
ALTER TABLE `vendedores`
  MODIFY `codigo` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=203;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `productos_ventas`
--
ALTER TABLE `productos_ventas`
  ADD CONSTRAINT `productos_ventas_ibfk_1` FOREIGN KEY (`codigo`) REFERENCES `productos` (`codigo`) ON UPDATE NO ACTION;

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`id_productosVentas`) REFERENCES `productos_ventas` (`id_productoVentas`) ON UPDATE NO ACTION,
  ADD CONSTRAINT `ventas_ibfk_2` FOREIGN KEY (`codigo`) REFERENCES `cliente` (`codigo`) ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
