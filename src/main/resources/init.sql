
CREATE COLLECTION `module-16`._default.member;

CREATE INDEX member_email ON `module-16`._default.member(email);

CREATE INDEX adv_DISTINCT_sports_sportName ON `default`:`module-16`.`_default`.`member`(DISTINCT ARRAY `s`.`sportName` FOR s in `sports` END)