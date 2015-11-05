-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Jeu 05 Novembre 2015 à 20:55
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `cabinetm`
--

-- --------------------------------------------------------

--
-- Structure de la table `patient`
--

CREATE TABLE IF NOT EXISTS `patient` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `datenais` date NOT NULL,
  `adresse` varchar(255) NOT NULL,
  `tel` varchar(255) NOT NULL,
  `cnam` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Contenu de la table `patient`
--

INSERT INTO `patient` (`id`, `nom`, `prenom`, `datenais`, `adresse`, `tel`, `cnam`) VALUES
(1, ' rihab', 'Shili', '2015-12-10', 'tuzer', '333333', 0),
(2, 'youssef', 'shili', '2015-11-10', 'tunis', '66666666666', 1),
(3, 'feten', 'ff', '2015-11-09', 'sfax', '555555', 1);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
