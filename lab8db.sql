-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema lab8db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema lab8db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `lab8db` DEFAULT CHARACTER SET utf8 ;
USE `lab8db` ;

-- -----------------------------------------------------
-- Table `lab8db`.`Users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lab8db`.`Users` (
  `idUsers` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `active` TINYINT(1) NOT NULL,
  PRIMARY KEY (`idUsers`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lab8db`.`Movies`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lab8db`.`Movies` (
  `idMovies` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NOT NULL,
  `overview` VARCHAR(45) NOT NULL,
  `popularity` DECIMAL(6,3) NOT NULL,
  `releaseDate` DATE NOT NULL,
  `idUser` INT NOT NULL,
  PRIMARY KEY (`idMovies`),
  INDEX `fk_Movies_Users_idx` (`idUser` ASC) VISIBLE,
  CONSTRAINT `fk_Movies_Users`
    FOREIGN KEY (`idUser`)
    REFERENCES `lab8db`.`Users` (`idUsers`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
