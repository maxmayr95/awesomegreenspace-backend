ALTER TABLE `payload` MODIFY battery int(11) NULL;
ALTER TABLE `payload` MODIFY `event` varchar(255) NULL;
ALTER TABLE `payload` MODIFY `light` int(11) NULL;
ALTER TABLE `payload` MODIFY `temperature` float NULL;

ALTER TABLE `payload`
ADD humidity float;

ALTER TABLE `payload`
ADD eco2 float;

ALTER TABLE `payload`
ADD tvoc float;