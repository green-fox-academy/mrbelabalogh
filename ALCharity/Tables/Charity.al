table 50104 Charity
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;
        }
        field(2; DonationId; Integer)
        {
            DataClassification = ToBeClassified;
            NotBlank = true; //?? VALIDATE !!
            TableRelation = Donation.Id where(IsDonated = const(false)); // ??? 
                                                                         //if (IsDonated = const(true)) then begin
                                                                         //(Type = const(IsDonated))
        }

        field(3; ApplicantId; Integer)
        {
            DataClassification = ToBeClassified;
            NotBlank = true; //?? vVALIDATE !!
            TableRelation = Applicant;
        }
    }

    keys
    {
        key(PK; Id)
        {
            Clustered = true;
        }
    }

    var
        myInt: Integer;

    trigger OnInsert()
    //To-do: When I add a new charity, only the NOT DONATED Donations should appear in the dropdown (conditional Table relation) !!
    var
        ApplicantRecord: Record Applicant;
        DonationRecord: Record Donation;
    begin
        Validate(DonationId);
        Validate(ApplicantId);

        if DonationRecord.Get(Rec.ApplicantId) then begin
            DonationRecord.IsDonated := true;
        end;

        if ApplicantRecord.Get(ApplicantId) <> DonationRecord.Get(DonationId) then begin
            if ApplicantRecord.CategoryId <> DonationRecord.CategoryId then begin
                Error('The category is invalid');
            end;
        end;

    end;

    trigger OnModify()
    begin

    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}