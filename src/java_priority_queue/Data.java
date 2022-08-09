package java_priority_queue;

public class Data {

    public static String data1 = """
                                12
                                ENTER John 3.75 50
                                ENTER Mark 3.8 24
                                ENTER Shafaet 3.7 35
                                SERVED
                                SERVED
                                ENTER Samiha 3.85 36
                                SERVED
                                ENTER Ashley 3.9 42
                                ENTER Maria 3.6 46
                                ENTER Anik 3.95 49
                                ENTER Dan 3.95 50
                                SERVED
                                """;

    public static String data2 = """
            647
            ENTER gONnPAaPm 0.33 18507
            ENTER unJYNjIMUPYStVjKPobcesc 2.24 89056
            SERVED
            SERVED
            SERVED
            ENTER NnUfAZUAblL 1.51 55796
            SERVED
            ENTER ulKRKfLLFejxtBHZkTPECz 3.11 86351
            ENTER teGfVioQaqzgaWHsPFpM 2.37 43236
            ENTER FOvFIrwAXwZ 1.16 5328
            ENTER cfWpmrqn 3.80 16140
            ENTER QcLFE 3.60 26699
            ENTER tETeDBrA 3.38 75853
            SERVED
            SERVED
            ENTER tbJfsLpFkxzXoZnr 3.39 51654
            SERVED
            SERVED
            ENTER ujKrjWkTsnJcUijhxPZvatRF 0.08 94776
            ENTER EiLmQqnjiYlzV 2.75 87519
            SERVED
            ENTER aNlNE 1.80 35885
            ENTER OKErOeGoQny 3.89 38843
            ENTER CqzAgEBGQHfv 0.37 81174
            ENTER DppjCwelNGxQgW 0.95 66318
            SERVED
            SERVED
            SERVED
            ENTER qAZDmBkQQfuZ 1.37 37436
            ENTER yZAxgDBLGFWK 2.74 48663
            ENTER hZDTIYeqoeqO 3.45 90790
            SERVED
            ENTER fjTuDZyfhlDpxquEuRorQ 0.51 61900
            ENTER jeIRIeVrhFVCJN 2.30 26353
            SERVED
            ENTER VNcsgrpCQtaXsoNMCz 2.02 57272
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER HlOiNpjyZzjbZywslVrorNTX 2.71 45182
            SERVED
            ENTER TjMPRLpIkrajv 1.27 21498
            ENTER nlxOyRcF 3.22 39619
            SERVED
            ENTER XrVGTKpyk 3.42 57645
            SERVED
            ENTER rqMmNIIcSjnILTcxqWkbS 2.46 80855
            SERVED
            ENTER obJXCxZRjUi 0.06 41108
            ENTER xrNcfmEQZgLx 0.41 92799
            SERVED
            SERVED
            ENTER KLLEcngGgpUxUpnpVFZ 2.45 14056
            ENTER xZtluQsYNvEpmC 3.49 36003
            SERVED
            ENTER ISnUNrZ 0.25 48570
            SERVED
            ENTER EXZZfDBXp 3.51 94423
            ENTER leesfj 1.10 45468
            ENTER slvgdNj 2.08 6355
            ENTER GzHmYfboZmQRc 1.40 87187
            ENTER IFHfRkTkSoXUxvjUhFiLuFg 1.80 94947
            ENTER NgFpfAbr 2.78 39546
            SERVED
            ENTER paCuPTsqJniv 1.14 64884
            SERVED
            ENTER xCzwriFNtrlAteN 1.12 39059
            SERVED
            ENTER RNZmNbTVaSekzxFN 3.31 3920
            ENTER CoJlJfHkkaOPKRfyufh 1.40 7286
            SERVED
            ENTER AvjngGfcKzhgmwRgF 0.08 8657
            ENTER AqlzmpmaaRMvsFLcqdgjFIQ 1.03 32141
            SERVED
            SERVED
            ENTER OGvIqCgKxnZAJZrk 1.49 87683
            SERVED
            ENTER wDZMjCyBNKBUgWfoJqT 2.82 79495
            SERVED
            SERVED
            ENTER NlHlLVCZAWiqqkEUgWBOL 2.05 51374
            SERVED
            ENTER RvSumFepPwRD 1.06 78017
            ENTER VZKXBvXSujWVRN 1.89 17656
            SERVED
            ENTER FzqzZJqeNplgBOuHXFewgjh 3.88 21047
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER CEtiksRMipm 2.20 33717
            ENTER vrFLaG 1.32 24047
            ENTER dOkbsQDvEFykGzrLAGxJ 0.96 52680
            SERVED
            SERVED
            SERVED
            ENTER MQnRN 2.87 91410
            SERVED
            SERVED
            ENTER msPrx 0.62 91923
            ENTER KvhjJVojw 0.81 30028
            ENTER htTBqumyzHINAzDkTGOqLX 0.55 69004
            SERVED
            ENTER tZVHKvyWcVSRwQNBYy 3.18 61318
            SERVED
            ENTER IyBTJZHFAiU 3.06 81383
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER hqgjdqWqQYXODLCTpEIW 2.54 3948
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER TZRGGLntbahtjoojrKODR 1.23 96582
            SERVED
            SERVED
            ENTER JXyfvxoTnLG 1.84 67944
            SERVED
            SERVED
            ENTER KbypORMMIYJVP 0.29 54891
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER ObFiMPQHWehccDcmUIZqv 1.97 26381
            ENTER twZwSVZeEJQKtiOeBfVsL 1.59 74741
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER bFZORLAqoU 1.41 67452
            ENTER XqoEtNKOxEPNvMg 1.50 1587
            SERVED
            ENTER MppMJFFzNlARYNDrzVRMjYJp 1.50 43161
            ENTER ThGbiQOsExzsehrhvGkUh 1.47 75086
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER wEVEuaFONXAhNlUDrpdH 2.18 31881
            SERVED
            SERVED
            ENTER sIYqNOlgAP 0.53 23408
            ENTER flfYMjh 2.47 10255
            ENTER TGhCAXghMkZNV 3.93 68861
            ENTER EbeKbeNqOEzpLApLv 0.97 45441
            SERVED
            SERVED
            ENTER DgmmsvlbPxSeSO 1.19 31120
            ENTER BCyHeQVewxtFAbjzI 1.82 49868
            ENTER hjniZweMYJgYKavWRbY 2.91 93687
            ENTER dWEHExHDmuPTGHXHMd 0.50 58839
            SERVED
            SERVED
            ENTER uFBMZGIiJjTCzCLTDNOYWi 0.76 82067
            ENTER AuFojkQMWEFScwbX 2.31 36584
            ENTER FOUDFLMUZBDNEtUyemGaioa 0.79 29396
            ENTER rYmTsat 1.09 55012
            ENTER mtZrnIXVHW 2.43 59376
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER iFhHbulOfYstlBJVAuOtzQpW 2.97 59173
            ENTER kXkeLtgRC 3.90 17001
            SERVED
            SERVED
            ENTER SzWiFylfqbLodZh 1.29 10700
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER gxRBOPmUdueFbtaZKB 0.80 61172
            ENTER URHXLqmNcHiaUqH 1.05 13625
            SERVED
            ENTER YiFQxLqfuXOQYvhGBqcLySG 2.85 63670
            ENTER wzqaPqXvNFMAhguZ 2.27 72761
            SERVED
            SERVED
            SERVED
            ENTER EulngDCfYVIvrgwFJ 2.32 93660
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER IJeDNHjBWxmi 2.67 90080
            ENTER StVXDMLvgnrelbQKMwPYTGRQ 1.81 64880
            ENTER WwAvJfCdbTMlnBjYqyfIe 1.38 88471
            ENTER KvGyzKUtMUJWuSNYDv 0.06 21207
            ENTER oifuIG 1.90 98942
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER fmYoDnspc 2.28 17343
            ENTER jovEszDUycHyapcPWWpgh 0.41 26226
            ENTER DouxrBaWAIpQKKj 3.39 24321
            SERVED
            SERVED
            SERVED
            ENTER yzNFjadwu 3.51 32577
            ENTER zEvSWheo 3.02 50948
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER VufbXvtShWxxDK 1.77 60120
            ENTER cToSUxWYOykY 3.71 91792
            ENTER NKCnqqFiKPapDUgNAZJjEWV 3.61 89833
            ENTER rmJsm 0.96 49358
            ENTER YCGweeSkQcgrGUEaS 1.47 84218
            ENTER wCWxbPvmDteAeJIIsM 3.04 2821
            ENTER GBlrupCUuLqVYe 0.83 76816
            SERVED
            ENTER FzCli 1.97 92275
            SERVED
            SERVED
            ENTER kNRRwsTKAaNR 2.10 30973
            SERVED
            ENTER JRmmpFiUQTDaOzWtINvnlqE 3.24 10553
            SERVED
            SERVED
            ENTER QTcKTVnYNizETUOHTRZ 2.79 56204
            ENTER sZUWYEcXkbqHv 0.76 95179
            SERVED
            ENTER KllZxwol 1.61 22018
            SERVED
            SERVED
            ENTER dkxRSzrdCFGTodnqUQUCesiy 0.47 76225
            SERVED
            SERVED
            ENTER NGfFOFRFB 1.72 29571
            ENTER FbErQQgJdt 2.17 48376
            SERVED
            SERVED
            ENTER qHiFLYOlZhvn 3.17 42847
            ENTER nyuJMsUcNHhjPsTDlRH 3.50 28278
            ENTER kQEUYFqBbgPKGJUxFecFbE 3.93 26520
            SERVED
            SERVED
            SERVED
            ENTER nMJiddEvCmyjcTbiIYw 2.07 3802
            ENTER pPxckYqB 3.11 20421
            ENTER xhGoiwQojjxe 0.90 69766
            SERVED
            ENTER CPrTMcW 3.58 39276
            ENTER MMRHAxFPqzhr 1.60 28107
            SERVED
            ENTER ZyavkUObKjadyAsRGzoz 2.11 50301
            SERVED
            ENTER rkKXTXEnHNGpYzWfVRhreKwuC 3.11 98192
            ENTER tAuDes 3.83 5044
            SERVED
            SERVED
            SERVED
            ENTER dDXTBko 2.34 40458
            SERVED
            ENTER ZXOJZSkQutjoCjFXgsFR 2.20 73082
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER CNqUAgs 0.93 46142
            SERVED
            ENTER XZnsDAogOAsooir 1.39 42373
            SERVED
            SERVED
            ENTER uCvfwHP 1.39 25586
            SERVED
            SERVED
            ENTER LwJPODjy 0.47 80267
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER CqXexUIzYWQBvPNXtK 3.68 33858
            ENTER qeIRh 2.63 75533
            SERVED
            ENTER shzOhKAH 3.42 15769
            ENTER hFllCql 1.75 3464
            SERVED
            ENTER sCVnWJQiPLiPzcPQYeVsKJh 1.50 42659
            ENTER NvLvt 0.09 39219
            ENTER GxIaaLGE 2.56 7872
            ENTER KYgMsrJhVTdxvUstTgokcmW 1.64 50401
            ENTER GOKaEn 0.22 92979
            ENTER EgGbdI 1.73 76506
            ENTER BZxOfHmeUJGZdGLXUuMv 2.46 94435
            SERVED
            ENTER aOFoPyPokJVRIMq 3.36 93540
            SERVED
            ENTER DShAG 0.34 89543
            ENTER UUJJKmOU 0.78 77426
            ENTER MRgtkOtTOXxdjTLPyXsM 3.12 87539
            SERVED
            ENTER VXAyIJQVmyCwjDSYC 2.40 10772
            SERVED
            ENTER QxIVMu 3.03 14839
            ENTER ErrwNFnVxUAhtgzVusvS 2.35 65810
            ENTER kpahMwZspLuZVVH 1.85 87400
            ENTER YrNowCBJUEoBiDihCIEK 3.36 87701
            ENTER AfZsAhwgpLKY 3.07 4841
            ENTER suBARTXEdLOGZYHQFsZxD 2.79 21722
            SERVED
            SERVED
            ENTER pZTGczzoWp 2.53 2802
            ENTER SFpCSPluBuMOokTtBjhGbI 3.80 19401
            SERVED
            SERVED
            ENTER pcujipKViDGMWZVHGj 0.06 7009
            ENTER WJXPMH 0.20 56060
            SERVED
            ENTER QhdrUICRKk 1.03 93795
            ENTER cASZNgFSIi 3.67 38441
            SERVED
            SERVED
            ENTER DxhSjPZOPzOwyxdwhoVtqmwkY 1.69 6324
            ENTER LPLqeYwfjxGsROxPSKVtKj 1.55 99826
            ENTER HJdvvcbTzRyOgd 2.74 4525
            SERVED
            ENTER aTTrdjQSVAkhUZTPculgBk 2.85 25805
            SERVED
            SERVED
            ENTER FRwiBPLSVTvJjdCLkZa 2.94 97024
            ENTER LPQVbtwoPQs 1.24 14012
            ENTER HIZDBBqIsCH 1.39 64664
            ENTER tnjMyJRrxndxDEKpVLBD 3.96 15177
            SERVED
            ENTER VrXrFYDi 3.36 85966
            SERVED
            SERVED
            ENTER jseAFkWjKsW 0.68 15142
            ENTER LCxmzUeZUljAXJPKsJjAz 3.72 42630
            SERVED
            ENTER SwippBt 1.26 11692
            ENTER DivgcUfkHoZCmxbpuncTsh 1.90 74680
            ENTER SqEJQEbHSZCNPazBYo 0.57 41497
            SERVED
            SERVED
            ENTER JKNDEhnJzJcORfeO 3.51 81772
            ENTER tOXOGwufnIbLgumJn 1.15 63128
            SERVED
            ENTER OwWeQbUMFAlJAloM 2.15 85647
            ENTER TruNawlyNTRALzgWNabJAwqv 2.86 96770
            ENTER zAOUqmZVwANeGtFP 2.91 30632
            ENTER NtqAegmUZumprNgGTCCnF 2.11 96589
            ENTER FhHQjLesadFwMPaO 3.24 33415
            ENTER RUROihkyMjSjFEgxJTCTK 1.56 54368
            ENTER LKBONDWtJXWkelco 2.43 63779
            ENTER lDqBid 0.08 75407
            SERVED
            SERVED
            ENTER unhnqXedVhPLThBGyewKKK 2.82 29404
            SERVED
            ENTER heQkCxzwLOtHPiisu 3.84 84108
            ENTER BTPvIXFisxEwAwDonin 3.51 26923
            ENTER CuLdluYwVBWTrbUPFBLoLxv 3.18 69765
            ENTER fVlGrsWYTzYdETy 3.20 11641
            ENTER hOlzXkVoGhPVisWnf 2.51 72229
            ENTER QZgmjQTjKTmtRfgfRth 3.66 77315
            ENTER AuyGyRbW 2.75 43327
            ENTER HklaBoHEG 1.40 46391
            SERVED
            SERVED
            ENTER YAgGpNhDjgXlPHGpMZ 1.58 51341
            ENTER EbLErVLgugYOTV 0.81 21589
            SERVED
            ENTER IyflkBF 3.71 32605
            ENTER mzLvBBBPLepVcRwqFOJ 1.17 21746
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER CFakNmIMN 3.13 25705
            SERVED
            SERVED
            SERVED
            ENTER LHZKFubXUyHbBXV 3.49 62237
            ENTER zQSSFJBHJnJbieSmEqEc 0.89 20180
            SERVED
            ENTER aQbkaZYBpgML 0.29 48084
            ENTER tIFQoFLXtRltNdCiIVaWRkb 3.81 73999
            SERVED
            SERVED
            SERVED
            ENTER BSyqTp 0.64 52377
            SERVED
            ENTER hOndKzgvuzkz 4.00 61689
            ENTER ehBNqnlwxsjMGfiTNLOYoM 0.63 21587
            ENTER BIYvEcRiHiKL 1.17 68836
            ENTER yXbvssiJtKkprYONaWzlLtx 3.53 44795
            SERVED
            SERVED
            ENTER czdyyXAIuitwnVTyIZSv 1.73 94677
            SERVED
            ENTER lPTuhANyCqnQqeMbEc 3.56 26513
            SERVED
            ENTER CacVkDoCOCaWVoq 1.98 59893
            ENTER wTjlp 2.79 17562
            SERVED
            SERVED
            ENTER voGaFLaTFNkYmSrZlYEQQ 1.39 73831
            ENTER uAtumtkZreYOX 1.08 45154
            SERVED
            ENTER HMZmitIbaqig 1.56 91827
            ENTER kgddTgpmnIHWHwmldCmsGEF 3.34 78391
            SERVED
            SERVED
            ENTER oBKIDKMecQUSc 0.99 89604
            SERVED
            ENTER tGLgDlxLVJu 2.65 27061
            SERVED
            SERVED
            ENTER cPGSNA 0.05 38022
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER tHeljIaopaKd 0.41 13978
            SERVED
            SERVED
            ENTER qZlmmcRonWJaluwDP 2.94 20838
            ENTER XOfdkMrc 2.94 80256
            ENTER lkLljR 0.99 72745
            ENTER uUJKsTyqbkJ 2.15 62827
            ENTER uHHmMdyGtxyWLJ 2.10 9454
            ENTER XUpcbgnacICZJiwOAfNAXkLGe 2.92 96633
            SERVED
            ENTER vzSdXxSXwjZTcFI 3.69 53083
            ENTER VaKEAHEoWzqZLPc 0.53 33134
            ENTER rAZkuIsmPAkRvUR 0.49 63339
            ENTER hevZNVzZBfCTImvbCqol 0.80 55111
            ENTER XzRcGPDebq 0.33 53631
            SERVED
            SERVED
            ENTER uBOgf 2.72 88827
            SERVED
            SERVED
            ENTER cjKIChbSQv 3.72 82184
            SERVED
            ENTER oPwWPrST 3.95 14965
            SERVED
            ENTER sJhnIgpSERHPsVux 3.98 44762
            ENTER pLUuwIlVkGIaxwmwAikrr 3.60 51676
            ENTER yEaWK 1.83 39743
            ENTER vRLQHg 2.21 78983
            SERVED
            SERVED
            SERVED
            ENTER bersuJvfPeRKOndbnOmgy 3.72 37976
            SERVED
            SERVED
            ENTER xdbdDwhfa 2.54 69996
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER jdodLDZT 3.91 14715
            ENTER gYAMZyFeD 3.28 11787
            ENTER zMicsTy 0.24 85580
            SERVED
            SERVED
            SERVED
            ENTER ppUQA 1.31 87657
            ENTER thTIIOcykZTSIW 2.24 37488
            ENTER LIYMD 3.94 43656
            SERVED
            ENTER QQVLyGJy 0.96 32612
            SERVED
            ENTER CMouqOiWUw 0.06 13518
            ENTER glcnfHV 2.65 41309
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER VTacXIKUSrHAlIvTp 0.21 73030
            SERVED
            SERVED
            ENTER WjthHfqOMDZxYLOZvYov 3.31 53809
            ENTER fhtfqsNzrmHR 3.18 6949
            ENTER towaNQEFYNTHKVmn 3.15 23187
            ENTER RczMZxKTs 3.58 92111
            ENTER KaSjVJLHdpLKOEdvaCO 0.50 50638
            SERVED
            SERVED
            SERVED
            ENTER LmxWGhJlyCdFhKzZth 3.12 64562
            ENTER XWcmpdXmyXhMYCaGlLghEGaf 0.38 88698
            SERVED
            SERVED
            ENTER iPITTcjYaAblqLwiXKbfv 1.94 813
            SERVED
            ENTER mxBsHJfPqkY 3.06 99235
            SERVED
            ENTER jeEHA 1.72 14438
            ENTER sVbDQLLmxNn 1.62 13849
            SERVED
            SERVED
            ENTER hBrLynIxjPIBvioAR 2.95 33489
            ENTER gBVVpUTXdqwhgRHUGAXjR 2.19 76103
            SERVED
            ENTER djibwJZSF 1.82 2365
            ENTER oFEefVvLox 0.31 99232
            ENTER YWuQbwbYGga 1.28 43348
            SERVED
            ENTER bVrCcyM 2.92 19634
            SERVED
            SERVED
            ENTER fxXgMcrJEJjjJwErEH 1.03 78533
            SERVED
            SERVED
            SERVED
            ENTER DWNoDZnAuJsiiMp 0.69 61537
            ENTER AOtRUG 1.77 81146
            ENTER ruNsgMdNwCsmKxBndQeMBp 1.92 27049
            SERVED
            SERVED
            ENTER RaLhvmeAigUcdaDlZZEQ 1.20 82157
            ENTER XcnuLhfOcSzwrrbHVySR 1.55 76952
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER WelgEJzLQZ 3.28 61772
            ENTER TxqJwqcOnUaWIJxSNtwgA 2.34 42491
            ENTER drzaCRCyBPv 2.16 15106
            ENTER KxCgvFCaHmz 2.68 99231
            ENTER HOVYPiVBgVUszfJeeUc 3.33 15480
            SERVED
            ENTER fpXXy 1.43 19325
            ENTER meAQuiSyJrZOVXuaPU 0.11 18923
            ENTER mzntHgOHpCvKCVaFEa 1.43 7420
            ENTER HsuZYxCKaBckdEYDHotLeML 1.03 76505
            SERVED
            SERVED
            SERVED
            ENTER jhDxJtyhmbJHMYCdOqD 1.42 2139
            ENTER ahmYGxOBOJbGjDAHxKbIr 2.69 14999
            SERVED
            SERVED
            ENTER lZaoiXzryLsEjWGSs 3.55 47553
            SERVED
            SERVED
            SERVED
            ENTER THtepxxAIJIpnFn 3.05 25346
            SERVED
            ENTER AMalejWYEoiMt 3.65 67346
            SERVED
            ENTER XFzgiys 2.90 16333
            SERVED
            ENTER JzCPHyWsDqSOVDOjxtNiCpohE 0.33 26684
            ENTER ByMoNTMKoEdhCh 2.70 37363
            SERVED
            ENTER BKIOKwixIaL 2.91 50235
            SERVED
            SERVED
            SERVED
            ENTER xMWCVKNGINIFnY 3.47 67114
            SERVED
            ENTER bBNAR 2.87 58142
            ENTER zeLCvlgKnRFA 0.89 65168
            SERVED
            SERVED
            ENTER FYKbEAtZNyaEivjlCCoGUV 0.16 50161
            ENTER LNPUPZzEuC 3.18 8841
            SERVED
            SERVED
            SERVED
            ENTER uuHxbGdLk 3.25 34015
            ENTER cshhJKJsOhTLE 3.97 69694
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER FyFmpRFitDrJdoSzERZtM 1.50 42689
            ENTER SUFowaacXBWCCICbDa 2.09 55614
            ENTER isWeOyplOD 1.82 31114
            ENTER mCLIkEvnWSuJFeJHi 1.49 5850
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER fYeTAg 3.58 31302
            ENTER UZtCbpCeqbChyjiIbrWlVza 1.59 88181
            SERVED
            ENTER kNQSEbALse 3.74 58308
            ENTER AQOJlaoqjjBmwuIZDCXtkGgg 3.37 6149
            SERVED
            ENTER bhTXgwxBXapl 0.44 18878
            SERVED
            ENTER QeuKDaGykLgcKMaMjkmMEZYB 0.26 63283
            ENTER xIScDQDQYgsIaDCIrSHyw 1.56 10102
            SERVED
            SERVED
            SERVED
            ENTER TciedoDWLSIPmjVjvbGi 3.99 9177
            ENTER YRmhpkjljftDW 3.11 54344
            ENTER LSSakg 1.19 73196
            SERVED
            ENTER RsyIxiKnWfwFbAoxRTL 2.74 34111
            ENTER Pbbhnxo 0.10 32439
            SERVED
            ENTER YqcTqZuCrWJYgGBV 1.27 99738
            ENTER JdnLsSjfjQgaQmGoSuRVnucDO 3.04 78456
            ENTER DDhATQKJuGPKLdm 2.01 39526
            SERVED
            ENTER pFWBEdDrAsdsgeBfGQFf 1.26 42732
            ENTER rbOqIWXkmqWjiWnhWys 3.50 83044
            ENTER xNibiXrQgtWom 0.77 8568
            SERVED
            ENTER QSnzBzYGaQIuJlmcDqQpA 2.91 77302
            SERVED
            ENTER aITRfCpgtXFhmzx 3.95 39344
            SERVED
            ENTER gUHsisBdEQIcbcvErtePM 2.47 15640
            ENTER vcXjRKRuOTphNTqEODMZ 1.33 57684
            ENTER xTUsyKhJnfSohcJ 1.98 55986
            SERVED
            SERVED
            SERVED
            ENTER yZzlS 3.93 45037
            ENTER wGShtjurEylKCOCcetvuKS 2.10 78896
            ENTER WoRXpXVvqVFRsRGwdK 2.96 67530
            SERVED
            ENTER XtOLSLGXueJGqArVRZel 3.80 68003
            SERVED
            SERVED
            """;

    public static String data3 = """
            1000
            ENTER enpvkNNsnuTTsnisdDMLUDlzH 2.61 75063
            SERVED
            ENTER RZQamFzODtqeESj 0.43 6539
            SERVED
            ENTER MLKGXqffmFOoaKhLA 1.80 4319
            ENTER NnqxvtQlKzkADwaKlY 3.17 83081
            ENTER PizUeyounCIorWApVq 3.96 79156
            SERVED
            ENTER TpLDy 3.20 20320
            ENTER MVkLXNMNNUKpfkbySNIWR 2.67 63941
            ENTER xbtBMfkUHBASEQNGXjdkbs 1.12 2818
            SERVED
            ENTER PyVnujqOLRazp 3.80 451
            SERVED
            ENTER dWFvjLUWLkw 2.58 39744
            SERVED
            SERVED
            ENTER DZtJfrcxtVefuhMZNFnUcCGy 2.58 5112
            SERVED
            ENTER hGjMQ 1.82 23479
            ENTER ezHwmbXlpJjHTGciP 1.61 39447
            SERVED
            ENTER sWIMxLcJLOwQxr 0.83 7335
            ENTER eilbUqVAWNfDTvIVNohMQGuz 3.83 83907
            ENTER fnhHWqMSeQIbAbtKUHMRlXLez 1.30 47912
            ENTER ZToRTPejjznEnlGHhCWuEB 1.79 29407
            ENTER hGyHUlvX 3.76 74499
            SERVED
            ENTER RcupXzlsMaDuvCvllzrnFam 2.27 77746
            SERVED
            SERVED
            SERVED
            ENTER ObEanUXRX 2.59 66631
            ENTER hOtbRiNazPVPnHEhvSECd 0.50 33578
            ENTER xlFpcsh 3.50 43471
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER EIYpC 3.06 82152
            ENTER zqlCQMhVQoFESKFMazhoqv 0.69 96877
            SERVED
            SERVED
            ENTER gCUsSncIWkGymhundzSR 1.04 83653
            ENTER vOZNtJIP 1.39 93955
            ENTER FCLoPEOEfxQmWUZMibkNcUG 3.19 93317
            ENTER zwzKIBiPq 2.52 53386
            SERVED
            ENTER pseZjMcGBsUnwh 2.47 70619
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER dWHdCSJMh 3.38 88867
            ENTER cWRotLfbkwQlXgY 1.81 36410
            ENTER fwYVXyRfyNBHb 1.35 1794
            ENTER oZgOaKzgQ 2.49 92131
            ENTER duRMvjkEcXgMFSmTNA 0.76 71763
            SERVED
            SERVED
            ENTER boPjffcHWpgAltCt 2.03 46985
            ENTER fyOudghwwjFtNiunTdkfqmQ 2.87 78058
            ENTER CGWAEDIXezM 2.83 43639
            ENTER uLDYfTYSWlChkY 0.26 96408
            SERVED
            SERVED
            ENTER ssIGabFYZZGJQgxB 0.41 67877
            ENTER tzZQrSusAufJzTXKqFJVwEWVe 0.69 55353
            ENTER OSWDlgFMdYyIYYFmOpwgvTSHf 3.57 13615
            SERVED
            SERVED
            SERVED
            ENTER ZXoXsKRIfTtH 2.10 15320
            SERVED
            ENTER LICiHdDYHpoQc 0.08 40165
            ENTER wKscQoTSvmsuTyLbpXWKG 3.05 26818
            ENTER WtTUqhxzkleCUMaBJrOwiFrPm 2.23 79880
            ENTER qPhflUQDnVvjuksEek 3.52 40269
            ENTER WnVOiSjPEtKATnbkmFs 1.23 74671
            SERVED
            SERVED
            ENTER SUTEufdzLUiGtVuNibZKJW 3.95 39822
            SERVED
            ENTER KeBOhPOsP 0.17 43886
            SERVED
            SERVED
            ENTER UhJmcESatAPCcGPC 3.66 4287
            SERVED
            SERVED
            ENTER aAqoVe 1.73 24072
            ENTER qJCRKggwoHHRVeYUcrbrvwG 0.50 52602
            SERVED
            ENTER CcHzSIcuGJPyBaatK 3.34 43795
            ENTER wsgyosEzBIvCZ 0.09 6749
            ENTER YXvMRcn 0.18 20631
            ENTER lkWuxgRCCsiMDyHQC 2.37 39726
            SERVED
            SERVED
            ENTER AQIvPOuVfxDAXBhtTKyhigli 2.25 66058
            SERVED
            ENTER WjcFbBxqzOvccj 2.25 12334
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER dLdNyaCsuRRPGK 0.31 29745
            ENTER DJDwVzbWiDIie 2.79 93811
            SERVED
            SERVED
            SERVED
            ENTER svoKgXvhApggnIHadk 1.50 33537
            ENTER QKsygdpG 0.34 85260
            SERVED
            ENTER JSHoYFdSodxkBkfscU 2.91 34623
            ENTER HddoTfvesEDJPFFtIdnJsXolF 0.44 27806
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER EUvVsFNXRObJa 1.29 16641
            ENTER TRmynwVwkLmVyOp 2.72 98636
            ENTER inAtYevFDiDCnueu 1.03 54812
            ENTER JBemYz 0.24 63605
            SERVED
            SERVED
            SERVED
            ENTER XfilZygKZ 2.44 87029
            ENTER ZPpkgUx 2.37 74383
            SERVED
            ENTER PLOGjasZCmKXQQSDfyMx 0.81 59324
            SERVED
            SERVED
            ENTER mcRNyYVtljziCqprCi 3.48 15953
            SERVED
            ENTER FAgHzYuYaLTlSxvUOfx 2.76 20758
            ENTER qYRwaHrpVp 2.55 37879
            SERVED
            ENTER vbbHJOLN 1.61 69760
            SERVED
            SERVED
            ENTER LYUeMJCbXumsODxEFu 2.49 40625
            ENTER xwmlxw 2.80 35393
            SERVED
            SERVED
            ENTER HqYPNBLcLeEUKcqmOXcekVIgQ 3.48 87489
            SERVED
            SERVED
            ENTER WkpPqDuPuRQi 1.63 78543
            SERVED
            SERVED
            ENTER SxDBBsgBDeB 0.42 31775
            ENTER MZDewLOpldEHyedi 3.02 20755
            ENTER DQVKNNixIiSpIN 3.40 24648
            SERVED
            ENTER QGVFRInaFqiEyZW 0.36 88446
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER eVirc 2.52 17098
            SERVED
            ENTER MtdtaURVlWw 3.61 78554
            ENTER LBQhqWBAnPf 1.07 99639
            ENTER XPohLrPdQQSB 1.83 13939
            ENTER vNitEzFkgdyGujAwn 2.50 81663
            SERVED
            ENTER CKYnjLhxRuQgHHIabFkarU 2.46 98923
            SERVED
            ENTER jcmQwGEWRrAfOFoU 3.52 38432
            SERVED
            ENTER DbpSvpXbKgqtgtLKzfLBtPlL 3.67 6456
            SERVED
            ENTER pfextlVogyzTPlXAdIKPNpYI 1.20 84985
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER oyMplSbYGKT 3.24 90312
            SERVED
            SERVED
            ENTER mLrcOvf 1.57 12924
            SERVED
            SERVED
            ENTER sHatqYnyheprkMQvqO 3.55 77926
            ENTER NsfTlhwJLHoJIxzld 0.80 95388
            SERVED
            SERVED
            ENTER uXCNsSjVQMNHayvOVVpfBizVD 3.02 87223
            SERVED
            SERVED
            ENTER XNGUsVY 1.92 69778
            SERVED
            ENTER Esmurhj 0.54 70239
            SERVED
            ENTER QIkLyFCle 1.06 61613
            ENTER SBCbXaJnCaZJrWykQbDtkubc 3.34 53170
            SERVED
            ENTER rpCdh 0.29 51778
            SERVED
            ENTER EUJWIqBDdnzEcpYbHKKBOFihw 3.24 85595
            ENTER pQUoZSWpdS 3.28 55242
            SERVED
            ENTER FXhwpoOD 2.91 48577
            ENTER IeSHY 1.20 66939
            SERVED
            ENTER TnAAcRnBuGVKCnFxgYOCc 3.76 95527
            SERVED
            ENTER pdqPgwBMSpufigfSthedePIrC 3.11 50911
            SERVED
            ENTER IuUnEIoUdzqYLopzfWDXqOstt 1.31 22230
            ENTER xxszoHRKR 1.66 3494
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER FflPgrmzBbkHalMrGTG 2.78 34377
            SERVED
            SERVED
            ENTER LleqtUrGxtcnUXxlpa 2.47 49987
            ENTER CBhrQCAvIVnzGJ 1.73 97770
            SERVED
            ENTER JUddSKSzF 0.96 87832
            SERVED
            ENTER dKbFTVOYbnYgZbuwPk 1.75 27263
            SERVED
            ENTER aPiynmj 0.15 1613
            SERVED
            SERVED
            ENTER SSzVeXyGGQjIEGXFnBlAbL 3.74 82393
            SERVED
            ENTER njHsiFGCbPJEelqKWOyUKRGyl 1.93 47787
            ENTER vkUzqBRCfY 1.05 95664
            ENTER NHooMPRMMZP 2.19 55610
            ENTER yyoWVb 3.55 35610
            ENTER CHHfZgZhCASWTNeUC 0.89 95021
            SERVED
            SERVED
            ENTER gOZDUBkOlXOCKOvMuC 1.68 80467
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER nDaxxjnBMdP 0.77 14730
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER BIlTySoZqtdLD 2.96 97349
            ENTER CCmkrWU 0.49 47083
            ENTER ioyjVdCX 2.73 48669
            ENTER WHHPZcxyvNQBIVGyMazt 2.84 56117
            SERVED
            ENTER zfehWF 1.32 35364
            SERVED
            ENTER tcQBMil 0.49 54541
            SERVED
            ENTER saBihapFUtHFecIHt 3.53 42957
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER aJOEvGrUHIi 3.66 36545
            ENTER azUWDrw 0.13 15842
            ENTER toKTBOqmqETzBUDG 3.57 18043
            SERVED
            SERVED
            ENTER RkBsuTaBJrcKXeBqjUc 2.01 16378
            ENTER NsMQF 2.09 4953
            ENTER UGxWvWPpvouZ 2.85 4159
            ENTER jqqfldAaZFulDrEEuHfL 3.78 56454
            SERVED
            ENTER ZUoHiQfuMxAevNXJuuZTiPYZP 3.41 9561
            ENTER VRIAYwZlSOqdMWjPyzyLO 2.54 41733
            SERVED
            SERVED
            SERVED
            ENTER emWNHtPX 2.62 33068
            ENTER BUsbv 0.66 78953
            SERVED
            SERVED
            SERVED
            ENTER ANSOPSP 2.49 25609
            SERVED
            SERVED
            ENTER xnfeYzLbWFNj 0.28 90654
            ENTER usWerCpxTgmDXrzE 0.94 86763
            SERVED
            SERVED
            ENTER fwZEDFbRRsyLoviAUJ 0.53 54879
            SERVED
            ENTER VbqWTBycnLTOiCAKkRnmYyVn 0.56 83504
            SERVED
            SERVED
            ENTER muDPuRdE 1.90 49830
            SERVED
            SERVED
            ENTER FOWID 0.96 85995
            ENTER LBFVxysgEbLnOuWHJjIpGEI 1.54 48406
            ENTER kguGWFOp 3.98 83784
            ENTER TwmGLifSnPREct 2.92 94602
            ENTER ipJJcbUVg 1.83 82995
            SERVED
            ENTER UiYLKemAtT 2.54 75422
            SERVED
            ENTER fsEboqxcwJaNOo 3.68 10798
            ENTER uxFiygjmCtFBCScaYll 3.37 25694
            ENTER aeTOTDAgQJiYyNGlt 0.98 93036
            ENTER zVumptt 2.67 87482
            ENTER GdYQFpdD 0.66 28275
            ENTER sdUyNlNFQqRLF 1.47 64674
            SERVED
            SERVED
            ENTER zRorCcHICceAgVeamyag 1.34 49704
            SERVED
            ENTER ENYSSYciWAigUxKWGCegBBP 1.37 40942
            SERVED
            SERVED
            ENTER raWruzwDkLJrT 3.06 87044
            ENTER EbgyLMcWGkP 0.45 78086
            SERVED
            SERVED
            ENTER bepstlbCgiNLfMwcCL 0.69 99613
            SERVED
            SERVED
            SERVED
            ENTER tWGNKjhNTdpTWhTnvpAIqFEK 3.61 92968
            SERVED
            ENTER hZkpsYilckzLkWktCp 1.30 36613
            ENTER tQKVeQBsdjALVYlAnUin 1.86 34154
            ENTER zdaXLHQoZU 0.11 36577
            SERVED
            SERVED
            ENTER cEbxhHnHcQtKfqKLjPh 3.56 98265
            SERVED
            ENTER UphJdguGxBNGhZ 3.11 28360
            ENTER AesnbubQXST 2.42 40236
            SERVED
            ENTER ZcBqIWLivF 2.86 93404
            ENTER aKwxh 3.24 48922
            ENTER xPorPztEaoOEPuMqN 0.10 84764
            ENTER tzLtcyuELbeKFVN 3.98 35450
            SERVED
            SERVED
            ENTER sksnxOdqmfDtjzfXXG 1.84 87812
            ENTER HebumZJvsplOAWOBHGn 0.18 77749
            SERVED
            ENTER mFJuUsigFhmFVLsUAGZ 3.31 49999
            SERVED
            SERVED
            ENTER eKLVTZRoncgUngGqDEejbsLD 0.68 65157
            ENTER wssBzoDlKlvTWFnDie 3.37 7304
            ENTER BXvMMApfuzjsYYT 0.69 62814
            ENTER fIcaKfZYSmpIgQMEQbau 1.83 57152
            ENTER QTKqAgivtdEgPGbY 3.48 27287
            ENTER LPdvjUEbzhhRkxecKDvn 3.58 6180
            ENTER gBbNfGatFqhZyO 3.53 60388
            ENTER BeRKayKjM 3.21 25884
            SERVED
            ENTER PbDgXwUxAFGd 3.24 57221
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER BZsBgXTzPnprGZcJFjQgYvh 1.49 83855
            ENTER WZnrBUb 2.93 73155
            SERVED
            SERVED
            ENTER EPkKCQavKOf 1.08 94156
            SERVED
            ENTER HxHkXGSDWFOxE 3.70 10296
            ENTER hVLwDWgPIIGfiGlk 0.62 6807
            ENTER waZxcqgDMGZLAP 1.44 36300
            ENTER KqnrMWzgBYCkD 0.37 10517
            SERVED
            ENTER yMKdNjStWNewLLoAiIntWm 2.10 48270
            SERVED
            ENTER FXSNwZVexHlEiSQqsvm 1.30 2193
            SERVED
            ENTER dGmfwgnyOyWnzJuetM 3.45 43043
            SERVED
            ENTER gynpaa 2.42 82340
            SERVED
            SERVED
            SERVED
            ENTER uimloeFyW 0.42 2403
            ENTER lVNaA 0.37 24219
            ENTER VicuXRakCzq 3.10 65775
            SERVED
            SERVED
            ENTER GGegrmodyyfQaEIokBN 3.46 97995
            ENTER YodKsvKhKqjDTM 0.62 97849
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER VrfIQxcKtYYL 2.97 2635
            ENTER dQSENQdXzthwXXnrcpEPUgFGP 1.53 10487
            ENTER YUHhvpoOZPWND 2.90 13318
            ENTER FcOaiBgaAErKw 2.29 52470
            ENTER RuqEdGHUUpSTFi 2.03 53781
            SERVED
            SERVED
            ENTER hryqZXQKuNjYmbomC 2.44 6893
            SERVED
            ENTER JdzkKKnTMICoBoRmyVeCuU 2.69 29192
            ENTER lVClkNHPTbdWhsXJqyRXlde 2.42 92725
            SERVED
            ENTER QoYQrHCejWyNAG 1.12 88478
            ENTER kEtvBJHCE 0.93 60411
            SERVED
            SERVED
            ENTER LrdMFTiGjHNvGqP 2.98 65284
            SERVED
            ENTER aykHltBrkhJlJRaaT 1.25 20408
            ENTER NFgqyFAwkSo 2.99 6841
            ENTER IavLMJOteBazvZHTzPCy 2.86 96983
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER GaDeYopcynsmBIHWokzSOxJJ 0.06 12485
            SERVED
            ENTER AYOKmUtcqQL 0.84 52736
            SERVED
            SERVED
            SERVED
            ENTER ttheStBHikCeYDpTiDbAwEgwK 1.57 36113
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER jCNReQCq 2.66 86624
            ENTER OSdyziFUqjeLaOYaxzsoPvg 1.11 53716
            SERVED
            ENTER PyWMfSwGVPnFIhwbFRDRPFXy 2.43 45000
            ENTER YxJzCoU 1.07 80057
            ENTER rfiPDeevIjitrwRG 1.22 4615
            ENTER RiCHJ 0.52 37096
            ENTER jAwxSDp 2.32 83001
            SERVED
            ENTER hoTiaJLCXGGl 3.10 7867
            ENTER DaAdcmiYckDtdmCRSyrDWATGh 2.62 53360
            ENTER oQIDNklyxoJZSbRML 0.47 97765
            ENTER wVlxpJrWXuKRaMzHOrIBUwXgm 3.18 12382
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER uWrXFWK 1.90 76139
            ENTER TviYGjCDgTqotTNwYwz 2.60 13241
            SERVED
            ENTER yQRRZXvVVpo 3.85 75106
            SERVED
            SERVED
            ENTER KVwgDIXSoUecJsOBtRNvftN 2.76 17973
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER mCjRyf 3.43 62863
            ENTER lKuSWErCGbQqpyV 2.35 39494
            ENTER AmgHXWMGfVSaXQqngyk 0.38 32882
            SERVED
            SERVED
            ENTER xFbwyPNau 2.39 93917
            ENTER rmihrCtMnqRjm 1.28 56930
            ENTER NVQDWTyMQm 1.21 91079
            ENTER ZIXJPagPvhCPa 0.86 45561
            SERVED
            ENTER fVXsJSWfkLrAB 2.45 61695
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER fkJYJJEqpxO 3.59 52068
            ENTER BEcXqlwLK 3.32 39470
            ENTER XGMVOfpbpVYsRQMXCyaDZE 3.94 18696
            ENTER ckwNVsecdPvDHFejoSluKSk 2.37 78808
            ENTER TCxDKXLazoTsVzUjIZw 1.15 98308
            ENTER WeGEIP 0.55 60460
            ENTER kjhVDFNLMfLyBsQuSQZL 1.48 53930
            SERVED
            ENTER SSQJXtLCzsCdRyYJkfwgwDQR 2.47 47010
            ENTER AEaNNqOJHNuwQXxtpPJIICKK 0.26 15864
            ENTER yODVFVnUGIFXIQpvhiSXgnnZS 1.07 60486
            ENTER UyiOLHvwwzrZrJirJtlgpAOut 1.27 465
            SERVED
            ENTER uGNTgV 0.46 66214
            ENTER KOAIBCCoyWLaqiOYe 2.51 990
            SERVED
            ENTER kilarbmJegiacmyLMoT 2.14 49626
            ENTER ofRMgVrDTKBzlUvKVLwaqX 2.61 31052
            ENTER mKwuNVUMyeL 2.75 27632
            ENTER FBGyqeYXdrnkQahjDVZjO 0.46 31053
            SERVED
            ENTER EaBLhE 1.42 37618
            SERVED
            SERVED
            ENTER lAXvhYkfvpnOYsbkMPfmK 2.02 81190
            SERVED
            ENTER HLVFkCxTPJZF 1.20 6979
            SERVED
            ENTER CtRTCmNazZRMsHssflkk 0.36 10348
            ENTER LrvJjPfMduXyFou 0.82 16447
            ENTER opsJzGtQTndH 3.45 75605
            ENTER tDaRpDy 0.90 43073
            SERVED
            ENTER xBaKzGvyKp 3.10 55831
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER hjGJxRWa 3.84 66558
            SERVED
            ENTER QnAPWE 1.87 67187
            SERVED
            ENTER xrnDbEJDQbasuQINHejyGaNCV 3.15 48658
            ENTER cphbPklCHIXys 2.63 27734
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER ssBzyGRJ 3.91 38891
            ENTER uNEKBwRmsYqewFFgi 2.21 7479
            ENTER VJokndOMQjZ 2.74 19574
            SERVED
            ENTER NOcRnJToi 2.87 25728
            SERVED
            SERVED
            SERVED
            ENTER nZraCOhMSjb 2.49 75054
            ENTER ZRHPmznLrRweoE 0.36 36897
            SERVED
            ENTER BtjYbjdJNp 2.76 87732
            ENTER rIxCwsQmWjJgUgL 0.87 71666
            SERVED
            ENTER FcTmZpeYBDqrEDnjDGpq 2.92 46697
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER eWEftITpyFh 1.62 3987
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER xiBwrtEHdMoRI 0.41 41376
            ENTER YBtehn 0.25 76168
            SERVED
            SERVED
            ENTER lbQUgdmTZrs 3.70 27356
            ENTER pKsXVhRFMeNnewjnKiOuif 1.44 72367
            ENTER SUOcNhMzPxMpDvABDlU 1.93 41174
            ENTER OIdsO 0.13 33145
            SERVED
            ENTER bKHNigtfXzaQlcBEXtzXbovgK 1.72 99764
            SERVED
            SERVED
            ENTER AbMtMYIpAbVu 2.44 72640
            ENTER mRCtCDAVvZIdylfJEfmcqFK 1.52 18327
            ENTER lmoTwBEpO 0.21 58787
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER TiPTdksEU 0.85 9680
            ENTER gujnJeVgOTEBdsxp 0.51 17764
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER HfcClJMMNMVyFNql 3.13 1065
            ENTER DBNFBbbXSbGDlZDOgGwn 1.21 89080
            ENTER EcTakauxNNEmuExXUbFdk 3.83 20250
            SERVED
            SERVED
            ENTER vqZZgNVXNSzlMEKxAjaoxPpB 1.93 7444
            SERVED
            ENTER IXoznt 3.93 80962
            SERVED
            SERVED
            SERVED
            ENTER hvZDIYeeASJhNSpKVhkjbAD 3.46 84661
            ENTER koGKAMIAWNNpeEwjaHMA 1.92 32802
            ENTER hqIiEtMeqfNopyJL 0.31 54602
            ENTER MhZTKBuGsWuMb 0.66 6165
            SERVED
            ENTER SuJbqSFOCbDPvqxMtlMN 1.82 70695
            SERVED
            SERVED
            ENTER xJcYFfXzMKRPIrxjAip 1.43 48186
            SERVED
            SERVED
            ENTER TlMSlCoGj 1.33 63654
            SERVED
            SERVED
            ENTER HHYJCrDHjNTKsoTuH 0.70 9970
            SERVED
            SERVED
            SERVED
            ENTER yYazIcndwuCPPXuXp 0.42 61012
            ENTER UDpZwNUVqZRPfzWYiMgyKTxBh 3.97 47782
            SERVED
            SERVED
            ENTER GCIukgDhpQf 2.37 60719
            ENTER lWBjimkVcmAoJhsuCbx 2.02 91381
            ENTER KQYVaUrNSiDXittiESGxJe 0.65 27629
            SERVED
            ENTER vRPTaC 2.79 886
            SERVED
            SERVED
            ENTER QPcYZZkYepZBwjLFshZoXMV 1.47 56533
            ENTER HBeamAFcflPtBXFy 2.35 15089
            SERVED
            SERVED
            ENTER WcFJJTbfMzsLh 1.45 64162
            SERVED
            ENTER GfdYm 2.56 40036
            ENTER pFDgFbOuQSiMxol 0.18 42485
            SERVED
            ENTER kHEhTxuPhqFSMjeOC 2.28 4404
            SERVED
            ENTER cXZdZtaGVTo 3.31 2356
            ENTER StOdKWqRUdtUfZBMGHXjPqyE 3.78 36904
            SERVED
            ENTER SstQEaBIwcG 2.64 54755
            ENTER DPmYOHanwK 3.41 52437
            ENTER RFjXJSGPKQzWOyUN 3.57 83530
            ENTER mtQaNsqoXhjuQXZFmhg 2.36 73240
            SERVED
            SERVED
            SERVED
            ENTER hgVogohSgqUuKr 0.91 93548
            ENTER HseRHswUNzHHJxQDZciGmVCzE 2.32 9273
            SERVED
            SERVED
            ENTER UtbVVKHAPUhczlMYvJzznFCVF 0.43 92121
            SERVED
            SERVED
            ENTER etAOrNbUFzV 1.11 22078
            ENTER PKBNCUv 1.27 14719
            ENTER MJkbsOToDEuPXGcxaqh 0.21 92163
            ENTER KllGxvTYBDurvyg 1.03 36380
            ENTER eGLtBK 1.12 20774
            SERVED
            ENTER gWkKkfDogootzYtfyO 2.27 79165
            SERVED
            ENTER DdytxekvUq 0.10 20687
            ENTER scsOdsfnmrRlEBtUQtLW 1.87 81881
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER XGBUDuRnWDdMynej 3.41 43717
            SERVED
            ENTER DCmbWpxWbCjBPP 3.91 98438
            ENTER tCjCABBMz 3.42 14420
            ENTER USWucFepiyUogSqajJqtIZ 3.62 14460
            SERVED
            SERVED
            SERVED
            ENTER QRCNiXoMBDdBhM 2.85 90142
            ENTER MwPLcNfdICmveIsSILFaQjKre 2.21 85631
            SERVED
            SERVED
            SERVED
            ENTER EoNwxiXEzAwW 1.19 47716
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER OxSCDKKSyIp 2.30 57396
            ENTER JcAbMVNSEA 1.07 29282
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER gfhWSLQvfioUtDpOeDMNEHFt 2.74 20470
            SERVED
            ENTER NtWdAPTLypXEwcvxY 3.06 3284
            SERVED
            SERVED
            SERVED
            ENTER QDXyRFyrAyZoDjIiOKAQCi 3.58 56050
            SERVED
            ENTER CtNhRdsZhIOazxxWKm 0.89 74576
            ENTER CrfgDhoAeqSLNotOPkBrjVfpx 1.73 53364
            SERVED
            SERVED
            ENTER PDQwVrJRp 3.41 44081
            ENTER GNbZOBRHKviZZJyMq 1.78 47967
            ENTER fRPjqtrHEINrFEDWYPiagKT 3.04 73461
            ENTER HnbsgAfmegn 1.24 99316
            SERVED
            ENTER SskOVVZNzCaMC 3.23 40291
            ENTER ERTYTgdF 1.73 59163
            ENTER KzRADbmbhBFqnhdjOoSd 0.90 8638
            SERVED
            ENTER XKpSCcyeUMrdj 3.14 98885
            ENTER nLvZjBydLOCXkXaZa 2.07 87671
            SERVED
            SERVED
            SERVED
            ENTER SFdpiyOVicyCiJhvQ 3.45 27866
            ENTER JsFbvG 3.19 20038
            SERVED
            ENTER YCBaFsUWpDJFFaJgtKS 2.47 73326
            SERVED
            SERVED
            ENTER elKJhvP 1.95 22200
            ENTER BGODrpgheNuILfUhWSslWTKM 1.91 8985
            ENTER fvfKYA 2.52 22764
            SERVED
            SERVED
            ENTER JlyDFbfjSomYGOizhjhKmBXJ 2.04 20303
            ENTER XEQdxJ 1.91 94140
            ENTER iygawWnfFCM 0.52 97789
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER aVidElJPiFPOjZaj 0.26 37800
            ENTER MPUFSeXOnRUONciPjJdXHi 0.31 38446
            ENTER CkjAepPwMdsKwmYxHX 0.96 73058
            ENTER rJvbgxPByVetfAhrwHLDAs 3.88 45477
            ENTER CnqyhFnVBSexmjWql 1.28 6854
            ENTER NPATRwzluaTbBGEEV 0.47 15319
            ENTER BbIEFcctfe 2.91 47211
            ENTER yWUuFeagdAyVDbenVbbGcY 0.04 95832
            ENTER XwiGSOijoeuCMS 1.50 25544
            ENTER GtcBhSJtoufxeIICVZpmmmwDz 1.16 77976
            ENTER qiVKEgsJEcI 1.41 70440
            ENTER RSyuJtUzOBInnDaSizANP 1.07 81596
            ENTER RqHzRGaMN 3.83 51008
            SERVED
            SERVED
            ENTER paQxDZezf 2.53 33475
            SERVED
            SERVED
            ENTER xKYDAuKoYKNMOlXpBrRXIXRdy 2.73 57021
            ENTER CJiMAnK 1.22 6466
            SERVED
            ENTER KYOZxSTfadhf 2.22 81004
            ENTER wMtBhpi 0.67 5830
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER cMAJSIonRZPm 1.02 6411
            ENTER UfodzkIUPq 1.65 61955
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER lbPfdh 3.99 40529
            SERVED
            ENTER TujJyAqfkNLyQvsBqDTZTtE 1.49 17756
            ENTER oCIlaYqmtfVYmhjzSq 0.90 54327
            ENTER donyjAYHfLr 2.43 72369
            ENTER YYkhfU 2.40 71225
            SERVED
            SERVED
            ENTER ElgHult 0.36 66435
            ENTER lmtaDxMMcJM 2.75 54605
            ENTER VbhDSfeqHipsHfCDhyBxEkwR 0.08 60541
            SERVED
            SERVED
            ENTER AeSWltKWYJeJjTDnVcDe 0.45 31519
            ENTER YHapUC 0.44 26945
            ENTER ZROvjjXKY 2.47 54454
            SERVED
            ENTER AsybwUtIBKUKUcWgkcIdNFf 1.19 33244
            SERVED
            ENTER stedKTzivLGuxWiUGGiLxtiS 0.07 8342
            ENTER hbvlEnxflCY 1.25 24170
            SERVED
            ENTER RoNJdTxrznB 2.75 98412
            SERVED
            ENTER CtzrYMJCehYKqfQeW 1.13 32545
            ENTER nmUNI 0.51 40342
            ENTER kwFBSPGRkwwCQCrblpzRQE 3.34 66539
            SERVED
            ENTER lFzVXIkJoqEbDoDuNsLVCLHF 0.80 47219
            ENTER SOeybsLNyG 3.26 314
            ENTER YLVssdLleRGbiBlpJmh 3.91 13696
            ENTER CAfIPV 2.26 14658
            SERVED
            SERVED
            ENTER ALifNKluDGwGne 2.08 94319
            ENTER rsRhrdXIGoZcodolgpwnUl 3.23 75843
            SERVED
            ENTER ihfPZUPkGQgSauqXemBjWbTc 3.65 92536
            ENTER TscDSTZnBkZUbLp 3.06 39694
            ENTER oOpEZFuy 3.31 23564
            SERVED
            ENTER YaiwseMkDNaPCOOuXJegVE 1.73 85806
            ENTER ryCYoUaXTBVQVaKdJSrZj 3.60 79256
            ENTER RcXPYjvzXpAvZkE 0.34 24342
            SERVED
            SERVED
            SERVED
            ENTER yrgCjKJ 1.30 49394
            ENTER ybbVlvUhZkFmzAetga 3.80 85177
            SERVED
            SERVED
            ENTER lrfmZhruRVMJCYiJsptOf 1.91 29630
            SERVED
            ENTER hdECBb 0.58 59162
            ENTER shCwltKRmYfHLBvgPBPMCBwb 4.00 14730
            SERVED
            ENTER MtmPGRfHTl 2.02 65264
            ENTER MMCrTnli 0.33 97741
            SERVED
            ENTER pqYDFCrFWHPUE 1.42 72960
            ENTER sCRfgrHvFrNTEOV 2.49 70783
            SERVED
            ENTER hmRLvQAQNgMOYVfXwkd 3.22 52517
            SERVED
            ENTER QxLKFdb 2.11 62038
            SERVED
            SERVED
            ENTER wqySKFXo 2.25 91574
            SERVED
            SERVED
            ENTER LnNCjZHVxQFgRARdpizjwBgxr 0.75 89792
            ENTER HDgYHeCQOMawCmj 1.95 13330
            SERVED
            ENTER mCyfGUQqvsGZUPsg 0.16 82649
            ENTER zSvYuBvaEscBoPDTc 1.02 62953
            ENTER fTfDGHQPKcFrrwRyD 1.77 14415
            ENTER BwwcAKfTQyKwIbQxpgpvxrem 3.35 60727
            SERVED
            ENTER TATDaX 1.77 32311
            ENTER appiUpzBdOMXoSCPvXgxkcgf 1.96 77230
            ENTER ArBDXRSksuqeIjpMNLODl 2.10 70500
            ENTER lXMKDs 2.51 77273
            ENTER YGxLawMqnZQBfVCxa 2.69 49915
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER EaGYnxIXReHQyrALpsAda 3.93 38596
            SERVED
            ENTER BVPebJAIgDXiDZX 3.48 59643
            SERVED
            ENTER sAgjDBPJkZXXO 2.07 72192
            SERVED
            SERVED
            ENTER nGicCIuxAPIMfL 0.76 76273
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER QuTOiugYXnffrsjLs 2.85 99439
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER CvnEoyynXtJzlh 3.02 33305
            ENTER VbukivdFGPqjqWWOhcaOJPbS 2.99 74349
            SERVED
            SERVED
            ENTER EWAKSUHNRqghvPlHD 2.28 35747
            SERVED
            ENTER NYTJrDc 0.64 41793
            SERVED
            ENTER VROaBdSrDToBVlAsZDKy 1.73 67843
            ENTER CepAbv 3.70 15415
            ENTER haeguJGYf 0.94 23020
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER oYSoUYjlycI 1.49 3501
            ENTER nyLqUgTZVLmBNWi 2.83 37903
            ENTER FWzmrWryFRj 1.71 94328
            ENTER ZMpPmZTxNGtVzMqXrFt 1.26 42448
            ENTER XSCRpuizmWnLxhxaBPoInHsk 0.50 84413
            SERVED
            SERVED
            ENTER FoubkN 1.33 53666
            SERVED
            SERVED
            ENTER XXpba 3.47 41209
            SERVED
            SERVED
            ENTER FkobKCUgdls 2.40 24304
            ENTER RUPfThSaykILsNguGHnERT 1.61 19570
            SERVED
            ENTER KTPPQElYaDEyvRKQizhwUXSPi 3.63 7686
            ENTER khwjTmtBHLOBA 3.13 63237
            ENTER sFNKqwRcVqMUqifGZxdtTD 1.55 99023
            SERVED
            SERVED
            ENTER xemJbIvPQoQ 2.37 51786
            SERVED
            SERVED
            ENTER uUsxMvvwMZbuEea 3.73 45555
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER OzUvWoOlFPhYLUJMMDeK 3.88 24821
            SERVED
            ENTER CLQcWsyvBplyr 3.05 39223
            SERVED
            ENTER TWMVdIqxjgBIgxkQWgfwO 3.66 78997
            ENTER GXWukqtveOAKfSduQgDKcwy 3.22 98296
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            SERVED
            ENTER SNYuVmvBACZVF 2.93 56185
            SERVED
            ENTER HzoeMLrwciZqT 1.40 28569
            ENTER GRIllHJLzK 3.21 1463
            SERVED
            SERVED
            ENTER NGuZsyf 2.17 60254
            ENTER DOMrXBlsCvQihIIBW 0.35 32308
            SERVED
            ENTER YWrQMUSnle 3.84 98409
            ENTER utLSNWoQfuiHWTOfDkTTZRMhw 1.18 51037
            SERVED
            SERVED
            ENTER bomCytxGHGi 0.09 97933
            SERVED
            ENTER tWnSdjEsxVSbZtGzgaGxfZO 1.79 48060
            ENTER mPFczoPwjwoCeP 2.23 62179
            ENTER mmbRRBFxaaHrZfwjRd 1.39 15519
            ENTER xpTQlNqz 1.27 57418
            SERVED
            ENTER glptxHNyLdGsyMZSYlr 2.78 35163
            ENTER VwEOAe 2.27 78203
            SERVED
            ENTER OIWuEdo 3.27 34376
            ENTER DrKFicspkkSpy 0.32 22336
            ENTER aWyFOuAWguGBKPUHoDu 0.98 83396
            ENTER cQxevQrKs 3.07 23053
            ENTER AJDvkuxSph 3.47 61668
            ENTER foWEzfuwptbFkwiWwXdqfua 3.53 1889
            ENTER LsIkkVNbdWABwIANR 3.78 20029
            SERVED
            ENTER zwwFQMwyzKmdM 0.77 39386
            SERVED
            SERVED
            ENTER WAIeqXSQml 2.34 19468
            ENTER GDwWukhV 2.54 6762
            SERVED
            ENTER bbITRAByzjSAIhovfOgS 3.18 6582
            ENTER wMgxDxWlQJrYaujHKIsnWrMp 3.59 50261
            ENTER NQZAbFSnPudOhyWuXFVsvU 0.98 42633
            SERVED
            SERVED
            SERVED
            ENTER sXeapHUzIkYqmjfaMAgkcL 3.22 48647
            SERVED
            ENTER sfAiidXuOoxQmlK 1.15 16592
            SERVED
            SERVED
            SERVED
            ENTER uEOxpQNXaMkpWM 1.65 96989
            SERVED
            ENTER efcHhxhYfdiVJEYsRx 0.62 57306
            ENTER iwKcOlSyvizeJ 2.55 68304
            ENTER zyozlUCSWW 1.29 71892
            ENTER kADHfrniomCCCAyc 3.41 96532
            SERVED
            SERVED
            ENTER iBWdYCecwjzDxhCZNBAZWv 2.04 21199
            SERVED
            SERVED
            """;

}
